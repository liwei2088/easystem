package cn.edu.hfuu.easystem.mapper;

import cn.edu.hfuu.easystem.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User findByUserName(String username);
}
