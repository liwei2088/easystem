package cn.edu.hfuu.easystem.mapper;

import cn.edu.hfuu.easystem.entity.Permission;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PermissionMapperTest {
    @Autowired(required = false)
    private PermissionMapper permissionMapper;

    /**
     * 测试权限表的插入功能
     */
//    @Test
//    public void insert() {
//        Permission permission = new Permission();
//        permission.setId(UUID.randomUUID().toString().replaceAll("-",""));
//        permission.setPid("5c9d422284a84c48bc3f576edb53d951");
//        permission.setType("menu");
//        permission.setTitle("结构管理");
//        permission.setPercode(null);
//        permission.setIcon("&#xe770");
//        permission.setHref("/sys/toOrgManager");
//        permission.setTarget(null);
//        permission.setOpen(0);
//        permission.setOrdernum(7);
//        permission.setStatus(1);
//        permissionMapper.insert(permission);
//    }
}