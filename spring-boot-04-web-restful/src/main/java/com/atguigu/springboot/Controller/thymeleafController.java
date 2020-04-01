package com.atguigu.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeleafController {

    @RequestMapping("thymeleafhello")
    public String thymeleafhello(Model model){
        model.addAttribute("msg", "这是thymeleaf啊！");
        return "success";
    }
}
