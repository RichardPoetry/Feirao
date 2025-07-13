package com.javafx;

import com.javafx.controller.UserController;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);


        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("phone");
        int phone = scanner.nextInt();
        System.out.println("cpf");
        int cpfNumber = scanner.nextInt();

         userController.createPersonalUser(name,  email,  phone,  cpfNumber);
    }
}