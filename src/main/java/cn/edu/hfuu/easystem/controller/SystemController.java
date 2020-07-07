package cn.edu.hfuu.easystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class SystemController {
    /**
     * 跳转到用户管理
     * @return
     */
    @RequestMapping("toUserManager")
    public String toUserManager(){
        return "system/user/userManager";
    }
}
