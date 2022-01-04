package com.itcraftsolution.socialchat.Model;

public class Story {

    private int Story , Profile, Like;
    private String Name;

    public Story(int story, int profile, int like, String name) {
        Story = story;
        Profile = profile;
        Like = like;
        Name = name;
    }

    public Story() {
    }

    public int getStory() {
        return Story;
    }

    public void setStory(int story) {
        Story = story;
    }

    public int getProfile() {
        return Profile;
    }

    public void setProfile(int profile) {
        Profile = profile;
    }

    public int getLike() {
        return Like;
    }

    public void setLike(int like) {
        Like = like;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
