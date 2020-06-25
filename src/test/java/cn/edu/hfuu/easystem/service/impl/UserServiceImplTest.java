package cn.edu.hfuu.easystem.service.impl;

import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findByUserName(){
        User user = userService.findByUserName("liwei");
        System.out.println(user);
    }
}