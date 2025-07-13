package com.javafx.model.domain.users;

public class PersonalUser extends User {

    private int cpfNumber;

    public PersonalUser() {
    }

    public PersonalUser(String name, String email, int phone, int cpfNumber) {
        super(name, email, phone);
        this.cpfNumber = cpfNumber;
    }

    public int getCpfNumber() {
        return cpfNumber;
    }

    @Override
    public String toString() {
        return "PersonalUser{" +
                "cpfNumber=" + cpfNumber +
                '}';
    }
}
