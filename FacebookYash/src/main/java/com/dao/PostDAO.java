package com.dao;

import com.model.Comment;
import com.model.Post;

import java.util.List;
import java.util.Map;

public interface PostDAO {
    int addPost(Post post, int uid, String username);
    int addComment(Comment comment);
    List<Map<String, String>> getPostCommentRows();
}