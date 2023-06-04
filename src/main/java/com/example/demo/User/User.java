package com.example.demo.User;

public class User {
    private Long id;
    private String login;
    private String email;
    private String password;
    private Boolean admin;
    private Boolean moderator;

    public User(Long id, String login, String email, String password, Boolean admin, Boolean moderator) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.admin = admin;
        this.moderator = moderator;
    }

    public User(String login, String email, String password, Boolean admin, Boolean moderator) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.admin = admin;
        this.moderator = moderator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getModerator() {
        return moderator;
    }

    public void setModerator(Boolean moderator) {
        this.moderator = moderator;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
