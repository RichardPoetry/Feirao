package com.javafx.model.domain.users;

public class User {

    private String name;
    private String email;
    private int phone;

    public User() {
    }
    public User(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}
