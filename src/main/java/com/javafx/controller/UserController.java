package com.javafx.controller;

import com.javafx.model.domain.users.BusinessUser;
import com.javafx.model.domain.users.PersonalUser;
import com.javafx.model.service.StorageService;
import com.javafx.model.service.StorageServiceImpl;

public class UserController {

    StorageService storageService = new StorageServiceImpl();

    public void createPersonalUser(String name, String email, int phone, int cpfNumber) {

        PersonalUser personalUser = new PersonalUser(name, email, phone, cpfNumber);

        storageService.savePersonalUser(personalUser);

    }

    public void createBusinessUser(String name, String email, int phone, int cnpj) {

        BusinessUser businessUser = new BusinessUser(name, email, phone, cnpj);

        storageService.saveBusinessUser(businessUser);
    }
}
