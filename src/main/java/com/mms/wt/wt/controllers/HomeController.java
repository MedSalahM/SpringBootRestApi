package com.mms.wt.wt.controllers;


import com.mms.wt.wt.domain.Post;
import com.mms.wt.wt.services.PostDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api/article/")

public class HomeController {
    public HomeController(PostDao postDao) {
        this.postDao = postDao;
    }

    PostDao postDao;
    @GetMapping("")

    public String indexPage(Model model)
    {

        List<Post> posts = new ArrayList<>();
        posts=postDao.AllPosts();
        model.addAttribute("posts",posts);

        return "index.html";
    }

    @GetMapping("/admin")
    public String adminPage()
    {

        return "admin.html";

    }

}
