package com.model;

public class Comment {
    private int commentID;
    private String commentContent;

    public Comment(int commentID, String commentContent) {
        this.commentID = commentID;
        this.commentContent = commentContent;
    }

    public Comment() {
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
