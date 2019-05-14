package com.jia.ren.oa.controller;


import com.jia.ren.oa.annotation.SystemControllerLog;
import com.jia.ren.oa.pojo.User;
import com.jia.ren.oa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class LoginController {

    //获取成功登录用户的id
    @Autowired
    private LoginService loginService;

    @GetMapping(value = "/user/login")
    @SystemControllerLog(description = "登录")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session){
        if (StringUtils.isEmpty(password)||StringUtils.isEmpty(password)){//用户名，密码为空重新返回登录页面
            map.put("msg","用户名密码为空");
            return  "login";
        }else {
            User user = loginService.login(username, password);
            if (user!=null){//如果有这个用户就让他跳转到主页
                session.setAttribute("user",user);//把当前用户保存到session里面
                map.put("user",user);
                return user.toString();
            }else{
                map.put("msg","用户名密码错误");
                return  "login";
            }
        }

    }

}
