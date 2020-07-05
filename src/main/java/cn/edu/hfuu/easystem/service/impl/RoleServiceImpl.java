package cn.edu.hfuu.easystem.service.impl;

import cn.edu.hfuu.easystem.mapper.RoleMapper;
import cn.edu.hfuu.easystem.service.RoleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleMapper roleMapper;

    @Autowired(required = false)
    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @Override
    public List<String> queryUserRoleIdsByUid(String userId) {
        return roleMapper.queryUserRoleIdsByUid(userId);
    }

    @Override
    public List<String> queryRolePermissionIdsByRid(String rid) {
        return roleMapper.queryRolePermissionIdsByRid(rid);
    }
}
