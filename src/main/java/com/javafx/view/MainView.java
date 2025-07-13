package com.javafx.view;

import java.util.Scanner;

public class MainView {

    Scanner scanner = new Scanner(System.in);
    UserView userView = new UserView();

    public void apresentation() {
        System.out.println("\uD835\uDCD5\uD835\uDCD4\uD835\uDCD8\uD835\uDCE1\uD835\uDCD0̃\uD835\uDCDE \uD835\uDCDE \uD835\uDCDC\uD835\uDCD4\uD835\uDCDB\uD835\uDCD7\uD835\uDCDE\uD835\uDCE1 \uD835\uDCDF\uD835\uDCE1\uD835\uDCD4\uD835\uDCD2̧\uD835\uDCDE \uD835\uDCD3\uD835\uDCD0 \uD835\uDCE1\uD835\uDCD4\uD835\uDCD6\uD835\uDCD8\uD835\uDCD0̃\uD835\uDCDE");
    }

    public void mainScreen(){
        System.out.println("CRIE SEU USUÁRIO");
        createUserView();


    }

    private void createUserView() {

        int result;

        System.out.printf("Se você é CNPJ digite 1,%n"
                        + "Se você é CPF digite 2.%n");

        do {
            System.out.println("Digite: ");
             result = scanner.nextInt();
            if (result < 1 || result > 2) {
                System.out.println("tipo de opção de invàlida, tente novamente novamente");
            }
        }while (result < 1 || result > 2);

            if (result == 1) {
                userView.createBusinessUser();
            } else if (result == 2) {
                userView.createPersonalUser();
            }
        }
    }


