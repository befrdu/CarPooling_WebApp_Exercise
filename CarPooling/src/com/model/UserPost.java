package com.model;

import java.time.LocalDate;

public class UserPost {
int postId;
int userId;
String post;
int postType;
LocalDate dateCreated;
LocalDate dateUpdated;
public UserPost(int postId, int userId, String post, int postType) {
	super();
	this.postId = postId;
	this.userId = userId;
	this.post = post;
	this.postType = postType;
}
public int getPostId() {
	return postId;
}
public void setPostId(int postId) {
	this.postId = postId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public int getPostType() {
	return postType;
}
public void setPostType(int postType) {
	this.postType = postType;
}
public LocalDate getDateCreated() {
	return dateCreated;
}
public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}
public LocalDate getDateUpdated() {
	return dateUpdated;
}
public void setDateUpdated(LocalDate dateUpdated) {
	this.dateUpdated = dateUpdated;
}
@Override
public String toString() {
	return "UserPost [postId=" + postId + ", userId=" + userId + ", post=" + post + ", postType=" + postType + "]";
}



}
