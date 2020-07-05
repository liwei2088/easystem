package cn.edu.hfuu.easystem.service;

import java.util.List;

public interface RoleService {

    List<String> queryUserRoleIdsByUid(String userId);

    List<String> queryRolePermissionIdsByRid(String rid);
}
