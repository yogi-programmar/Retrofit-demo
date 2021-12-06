package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    @Expose
    public String login;
    @SerializedName("id")
    @Expose
    public int id;
    @SerializedName("repos_url")
    @Expose
    public String repos_url;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", repos_url='" + repos_url + '\'' +
                '}';
    }

    public User(String login, int id, String repos_url) {
        this.login = login;
        this.id = id;
        this.repos_url = repos_url;
    }



}