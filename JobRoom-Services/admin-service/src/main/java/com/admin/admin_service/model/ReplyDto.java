package com.admin.admin_service.model;

import java.sql.Timestamp;

public class ReplyDto {
    private int id;
    private Comment comment;
    private String userId;
    private String description;
    private Timestamp createdDate;
    private boolean status;
    private UserResponse userResponse;

    public ReplyDto() {
    }

//    public ReplyDto(int id, Comment comment, String userId, String description, Timestamp createdDate, boolean status) {
//        this.id = id;
//        this.comment = comment;
//        this.userId = userId;
//        this.description = description;
//        this.createdDate = createdDate;
//        this.status = status;
//    }


    public ReplyDto(int id, Comment comment, String userId, String description, Timestamp createdDate, boolean status, UserResponse userResponse) {
        this.id = id;
        this.comment = comment;
        this.userId = userId;
        this.description = description;
        this.createdDate = createdDate;
        this.status = status;
        this.userResponse = userResponse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getDescription() {
        return description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public UserResponse getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserResponse userResponse) {
        this.userResponse = userResponse;
    }

    @Override
    public String toString() {
        return "ReplyDto{" +
                "id=" + id +
                ", comment=" + comment +
                ", userId='" + userId + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", status=" + status +
                ", userResponse=" + userResponse +
                '}';
    }
}
