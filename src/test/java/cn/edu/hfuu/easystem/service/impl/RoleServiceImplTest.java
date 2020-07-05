package cn.edu.hfuu.easystem.service.impl;

import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.service.RoleService;
import cn.edu.hfuu.easystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.relation.RoleList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleServiceImplTest {
    @Autowired
    private RoleService roleService;

    /**
     * 测试 通过用户ID查找对应的角色ID
     */
    @Test
    void queryUserRoleIdsByUid() {
        List<String> stringList = roleService.queryUserRoleIdsByUid("11111111111111111111111111111111");
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    /**
     * 测试 通过角色朝招应相应的资源权限
     */
    @Test
    void queryRolePermissionIdsByRid() {
        List<String> stringList = roleService.queryRolePermissionIdsByRid("4f54712931be49eca0d1277fdfca3d48");
        stringList.forEach(t-> System.out.println(t));
    }
}