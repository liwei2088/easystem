package cn.edu.hfuu.easystem.service.impl;

import cn.edu.hfuu.easystem.Common.TreeNode;
import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.service.PermissionService;
import cn.edu.hfuu.easystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PermissionServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    /**
     * 获取用户对应的菜单信息
     */
    @Test
    void findMenuByUser() {
        User user = userService.findByUserName("admin");
        List<TreeNode> menu = permissionService.findMenuByUser(user);
        menu.forEach(m -> System.out.println(m.toString()));
    }
}