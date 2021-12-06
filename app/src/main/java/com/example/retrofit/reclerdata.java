package com.example.retrofit;

public class reclerdata {
    public String login;
    public int id;
    public String repos_url;
    public String state;


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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public reclerdata(String login, int id, String repos_url, String state) {
        this.login = login;
        this.id = id;
        this.repos_url = repos_url;
        this.state = state;
    }


}
