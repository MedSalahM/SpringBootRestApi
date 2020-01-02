package com.mms.wt.wt.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/article/")

public class HomeController {

    @GetMapping("")
    public String indexPage()
    {

        return "index.html";
    }

    @GetMapping("/admin")
    public String adminPage()
    {

        return "admin.html";

    }

}
