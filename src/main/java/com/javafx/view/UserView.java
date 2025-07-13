package com.javafx.view;

import com.javafx.controller.UserController;

import java.util.Scanner;

public class UserView {

    Scanner scanner = new Scanner(System.in);
    UserController userController = new UserController();

    public void createBusinessUser() {

        System.out.println("digite o nome de sua empresa");
        String name = scanner.nextLine();
        System.out.println("digite seu email");
        String email = scanner.nextLine();
        System.out.println("digite sua telefone");
        int phone = scanner.nextInt();
        System.out.println("digite sua cnpj");
        int cnpj = scanner.nextInt();
        userController.createBusinessUser(name,email, phone, cnpj);

    }

    public void createPersonalUser() {

        System.out.println("digite seu nome");
        String name = scanner.nextLine();
        System.out.println("digite seu email");
        String email = scanner.nextLine();
        System.out.println("digite sua telefone");
        int phone = scanner.nextInt();
        System.out.println("digite sua cpf");
        int cnpj = scanner.nextInt();
        userController.createPersonalUser(name,email, phone, cnpj);
    }
}
