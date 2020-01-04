package com.mms.wt.wt.services;

import com.mms.wt.wt.domain.Post;

import java.util.List;

public interface PostDaoImp  {

    public List<Post> AllPosts ();
    public  Post addNewPost(Post p);
    public Post getPost(int id);

}
