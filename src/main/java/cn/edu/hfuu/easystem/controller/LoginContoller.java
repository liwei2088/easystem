package cn.edu.hfuu.easystem.controller;

import cn.edu.hfuu.easystem.Common.ActiveUser;
import cn.edu.hfuu.easystem.Common.ResultObj;
import cn.edu.hfuu.easystem.Common.WebUtils;
import cn.edu.hfuu.easystem.service.UserService;
import cn.edu.hfuu.easystem.vo.UserVo;
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class LoginContoller {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/check")
    @ResponseBody
    public ResultObj login(UserVo userVo, String code, HttpSession session) {
        String sessionCode = (String) session.getAttribute("code");
        if (code != null && sessionCode.equals(code)) {
            Subject subject = SecurityUtils.getSubject();
            AuthenticationToken token = new UsernamePasswordToken(userVo.getUsername(), userVo.getPassword());
            try {
                subject.login(token);
                ActiveUser activerUser = (ActiveUser) subject.getPrincipal();
                WebUtils.getSession().setAttribute("user",activerUser.getUser());
                return ResultObj.LOGIN_SUCCESS;
            } catch (AuthenticationException e) {
                e.printStackTrace();
                return ResultObj.LOGIN_ERROR_PASS;
            }
        }
        return ResultObj.LOGIN_ERROR_CODE;
    }


    @RequestMapping("/getCode")
    public void getCode(HttpServletResponse response, HttpSession session) {
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(116, 36, 4, 5);
        session.setAttribute("code", lineCaptcha.getCode());
        try {
            ServletOutputStream outputStream = response.getOutputStream();
            lineCaptcha.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
