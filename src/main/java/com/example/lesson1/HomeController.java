package com.example.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/welcome")
    public String homePage()
    {
        return "index";
    }
}
