package cn.edu.hfuu.easystem.service.impl;

import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.mapper.UserMapper;
import cn.edu.hfuu.easystem.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private UserMapper userMapper;

    @Autowired(required = false)
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }

}
