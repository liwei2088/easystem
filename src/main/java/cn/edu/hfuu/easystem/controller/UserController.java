package cn.edu.hfuu.easystem.controller;

import cn.edu.hfuu.easystem.service.UserService;
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("/getCode")
    public void getCode(HttpServletResponse response, HttpSession session){
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(116, 36, 4, 5);
        session.setAttribute("code",lineCaptcha.getCode());
        try{
            ServletOutputStream outputStream = response.getOutputStream();
            lineCaptcha.write(outputStream);
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
