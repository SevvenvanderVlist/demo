package com.example.demo.navigation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {

    @GetMapping(value = "/")
    public String index(Model model) {

        return "index";
    }

    @GetMapping(value = "/login")
    public String login(Model model)
    {
        return "login";
    }

    @GetMapping(value = "/register")
    public String register(Model model)
    {
        return "register";
    }
}
