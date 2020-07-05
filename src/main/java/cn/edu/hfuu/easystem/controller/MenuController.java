package cn.edu.hfuu.easystem.controller;

import cn.edu.hfuu.easystem.Common.ResultObj;
import cn.edu.hfuu.easystem.Common.TreeNode;
import cn.edu.hfuu.easystem.Common.WebUtils;
import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.service.PermissionService;
import cn.edu.hfuu.easystem.service.RoleService;
import cn.edu.hfuu.easystem.service.UserService;
import cn.edu.hfuu.easystem.vo.PermissionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private PermissionService permissionService;

    @Autowired
    public void setPermissionService(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @RequestMapping("/loadIndexLeftMenuJson")
    public ResultObj<TreeNode> loadIndexLeftMenuJson(PermissionVo permissionVo) {
        User user = (User) WebUtils.getSession().getAttribute("user");
        List<TreeNode> treeNodeList = permissionService.findMenuByUser(user);
        return new ResultObj<TreeNode>(200, treeNodeList);
    }
}
