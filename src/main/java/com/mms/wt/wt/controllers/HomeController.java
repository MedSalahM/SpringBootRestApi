package com.mms.wt.wt.controllers;


import com.mms.wt.wt.domain.Post;
import com.mms.wt.wt.services.PostDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api/article")

public class HomeController {
    public HomeController(PostDao postDao) {
        this.postDao = postDao;
    }

    PostDao postDao;
    @GetMapping({"/",""})

    public String indexPage(Model model)
    {

        List<Post> posts = new ArrayList<>();
        posts=postDao.AllPosts();
        model.addAttribute("posts",posts);

        return "index.html";
    }


    @GetMapping("/add")
    public String addingPostPage(Model model , Post post)
    {
        model.addAttribute("post",post);
        return "newpost.html";
    }

    @PostMapping("/addpost")
    public String addNewPost(@ModelAttribute  Post post  )
    {

      postDao.addNewPost(post);
      return "redirect:" ;

    }

    @GetMapping("/admin")
    public String adminPage()
    {

        return "admin.html";

    }

    @GetMapping("/{id}")
    public String getPost(Model model ,Post p , @PathVariable int id)
    {
        p=postDao.getPost(id);
        model.addAttribute("posts",p);
        return "posts.html";

    }

}
