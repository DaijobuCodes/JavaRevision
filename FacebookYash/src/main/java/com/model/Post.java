package com.model;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private int postID;
    private int userID;
    private String username;
    private String postContent;
    private String time;

    private List<Comment> comments = new ArrayList<>();
    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }



    public Post(String postContent) {
        this.postContent = postContent;
    }

    public Post(int postID, int userID, String username, String postContent, String time) {
        this.postID = postID;
        this.userID = userID;
        this.username = username;
        this.postContent = postContent;
        this.time = time;
    }

    public Post() {
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getTime() {
        return time;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
