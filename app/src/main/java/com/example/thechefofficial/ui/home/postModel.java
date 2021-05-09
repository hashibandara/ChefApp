package com.example.thechefofficial.ui.home;

public class postModel {
    private String recipeName;
    private String recipeDes;
    private String recipImg;
    private String userId;
    private String  userPic;
    private String  userName;

    public postModel() {
    }

    public postModel(String recipeName, String recipeDes, String recipImg, String userId, String userPic,String userName) {
        this.recipeName = recipeName;
        this.recipeDes = recipeDes;
        this.recipImg = recipImg;
        this.userId = userId;
        this.userName = userName;
        this.userPic = userPic;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDes() {
        return recipeDes;
    }

    public void setRecipeDes(String recipeDes) {
        this.recipeDes = recipeDes;
    }

    public String getRecipImg() {
        return recipImg;
    }

    public void setRecipImg(String recipImg) {
        this.recipImg = recipImg;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
