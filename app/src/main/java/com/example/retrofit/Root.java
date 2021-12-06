package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Root {

    @SerializedName("user")
    @Expose
    public  User User;
    @SerializedName("state")
    @Expose
    public String state;
    public Root(String state, User User) {
        this.state = state;
        this.User = User;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public com.example.retrofit.User getUser() {
        return User;
    }

    public void setUser(com.example.retrofit.User user) {
        User = user;
    }




}
