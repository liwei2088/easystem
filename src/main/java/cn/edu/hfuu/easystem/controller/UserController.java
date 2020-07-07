package cn.edu.hfuu.easystem.controller;

import cn.edu.hfuu.easystem.Common.ResultObj;
import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.service.UserService;
import cn.edu.hfuu.easystem.vo.UserVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired(required = false)
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/loadAllUser")
    public ResultObj<User> loadAllUser(UserVo userVo) {
        //处理分页
        IPage<User> page = new Page<User>(userVo.getPage(), userVo.getLimit());
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        //根据用户登录名称以及用户名称模糊查询用户
        //queryWrapper.like(StringUtils.isNotBlank(userVo.getUsername()), "username", userVo.getUsername());
        //queryWrapper.eq("type", Constast.USER_TYPE_NORMAL);
        queryWrapper.orderByDesc("id");
        userService.page(page, queryWrapper);
        List<User> list = page.getRecords();
        return new ResultObj<User>(0, page.getTotal(), list);
    }
}
