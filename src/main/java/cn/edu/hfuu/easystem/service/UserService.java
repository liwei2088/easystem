package cn.edu.hfuu.easystem.service;

import cn.edu.hfuu.easystem.entity.User;

public interface UserService {

    User findByUserName(String username);

}
