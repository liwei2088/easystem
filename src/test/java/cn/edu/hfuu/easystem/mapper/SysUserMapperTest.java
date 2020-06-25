package cn.edu.hfuu.easystem.mapper;

import cn.edu.hfuu.easystem.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SysUserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSysUserMapper() {
        List<User> users = userMapper.findAll();
        users.forEach(u -> System.out.println(u));
    }
}