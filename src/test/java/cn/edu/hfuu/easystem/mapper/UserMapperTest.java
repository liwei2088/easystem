package cn.edu.hfuu.easystem.mapper;

import cn.edu.hfuu.easystem.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void findAll() {
        User user = userMapper.findByUserName("admin");
        System.out.println(user);
    }
}