package cn.edu.hfuu.easystem.mapper;

import cn.edu.hfuu.easystem.entity.Role;
import cn.edu.hfuu.easystem.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleMapperTest {

    @Autowired(required = false)
    private RoleMapper roleMapper;

    /**
     * 测试角色表的插入功能
     */
//    @Test
//    public void insert() {
//        Role role = new Role();
//        role.setId(UUID.randomUUID().toString().replaceAll("-", ""));
//        role.setName("普通教师");
//        role.setRemark("拥有教师的基本权限");
//        role.setStatus(1);
//        role.setCreatetime(new Date());
//        roleMapper.insert(role);
//    }

}