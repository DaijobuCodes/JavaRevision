package com.dao;

import com.model.Post;

import java.util.List;

public interface PostDAO {
    int addPost(Post post, int uid, String username);
    int addComment(Post book);
    List<Post> view();
}