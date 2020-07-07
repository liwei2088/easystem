package cn.edu.hfuu.easystem.service;

import cn.edu.hfuu.easystem.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {

    User findByUserName(String username);

}
