package cn.edu.hfuu.easystem.mapper;

import cn.edu.hfuu.easystem.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    // 查询当前用户拥有的角色ID集合
    List<String> queryUserRoleIdsByUid(@Param("id") String userId);

    List<String> queryRolePermissionIdsByRid(@Param("id") String rid);
}
