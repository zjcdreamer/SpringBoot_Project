package com.atguigu.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class loginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(password) && "123456".equals(password)){
            session.setAttribute("loginuser",username);
            return "redirect:/main.html";
        }else {
            map.put("passworderr","用户名密码错误");
            return "index";
        }
    }
}
