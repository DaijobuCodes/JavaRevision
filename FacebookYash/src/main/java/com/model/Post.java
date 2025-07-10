package com.model;

public class Post {
    private int postID;
    private String postContent;

    public Post(int postID, String postContent) {
        this.postID = postID;
        this.postContent = postContent;
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

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
