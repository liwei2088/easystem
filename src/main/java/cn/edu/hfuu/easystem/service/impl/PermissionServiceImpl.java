package cn.edu.hfuu.easystem.service.impl;

import cn.edu.hfuu.easystem.Common.Constast;
import cn.edu.hfuu.easystem.Common.ResultObj;
import cn.edu.hfuu.easystem.Common.TreeNode;
import cn.edu.hfuu.easystem.Common.TreeNodeBuilder;
import cn.edu.hfuu.easystem.entity.Permission;
import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.mapper.PermissionMapper;
import cn.edu.hfuu.easystem.service.PermissionService;
import cn.edu.hfuu.easystem.service.RoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

    private PermissionMapper permissionMapper;
    private RoleService roleService;

    @Autowired(required = false)
    public void setPermissionMapper(PermissionMapper permissionMapper) {
        this.permissionMapper = permissionMapper;
    }

    @Autowired
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public List<TreeNode> findMenuByUser(User user) {
        QueryWrapper<Permission> queryWrapper = new QueryWrapper<Permission>();
        queryWrapper.eq("type", Constast.TYPE_MENU); //资源类型为菜单
        queryWrapper.eq("status", Constast.AVAILABLE_TRUE); //资源状态有效
        List<Permission> list;
        if (user.getType() == Constast.USER_TYPE_SUPER) {
            //超级管理员权限
            list = permissionMapper.selectList(queryWrapper);
        } else {
            //普通用户权限
            String id = user.getId();
            //获取用户所对应的角色
            List<String> currentUserRoleIds = roleService.queryUserRoleIdsByUid(id);
            Set<String> pids = new HashSet<String>();
            for (String rid : currentUserRoleIds) {
                List<String> permissionIds = roleService.queryRolePermissionIdsByRid(rid);
                pids.addAll(permissionIds);
            }
            if (pids.size() > 0) {
                queryWrapper.in("id", pids);
                list = permissionMapper.selectList(queryWrapper);
            } else {
                list = new ArrayList<>();
            }
        }
        //构建菜单树型结构数据
        List<TreeNode> treeNodes = new ArrayList<TreeNode>();
        for (Permission p : list) {
            String id = p.getId();
            String pid = p.getPid();
            String title = p.getTitle();
            String icon = p.getIcon();
            String href = p.getHref();
            Boolean spread = p.getOpen().equals(Constast.OPEN_TRUE);
            treeNodes.add(new TreeNode(id, pid, title, icon, href, spread));
        }
        return TreeNodeBuilder.build(treeNodes, "11111111111111111111111111111111");
    }
}
