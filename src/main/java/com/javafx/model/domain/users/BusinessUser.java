package com.javafx.model.domain.users;

public class BusinessUser extends User {

    private int cnpj;

    public BusinessUser() {
    }

    public BusinessUser(String name, String email, int phone, int cnpj) {
        super(name, email, phone);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }
}
