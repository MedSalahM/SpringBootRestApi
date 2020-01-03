package com.mms.wt.wt.services;


import com.mms.wt.wt.domain.Post;
import com.mms.wt.wt.repositories.PostRepositorie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostDao  implements PostDaoImp{
    public PostDao(PostRepositorie postRepositorie) {
        this.postRepositorie = postRepositorie;
    }

    PostRepositorie postRepositorie;
    @Override
    public List<Post> AllPosts() {
        List<Post> posts = new ArrayList<>();
        postRepositorie.findAll().forEach(posts::add);
        return posts ;
    }
}
