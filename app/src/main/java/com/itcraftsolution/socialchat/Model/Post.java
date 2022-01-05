package com.itcraftsolution.socialchat.Model;

public class Post {
    private int Profile, Post,Save;
    private String Name,bio,Like, Comment, Share;

    public Post(int profile, int post, int save, String name, String bio, String like, String comment, String share) {
        Profile = profile;
        Post = post;
        Save = save;
        Name = name;
        this.bio = bio;
        Like = like;
        Comment = comment;
        Share = share;
    }

    public Post() {
    }

    public int getProfile() {
        return Profile;
    }

    public void setProfile(int profile) {
        Profile = profile;
    }

    public int getPost() {
        return Post;
    }

    public void setPost(int post) {
        Post = post;
    }

    public int getSave() {
        return Save;
    }

    public void setSave(int save) {
        Save = save;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLike() {
        return Like;
    }

    public void setLike(String like) {
        Like = like;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getShare() {
        return Share;
    }

    public void setShare(String share) {
        Share = share;
    }
}
