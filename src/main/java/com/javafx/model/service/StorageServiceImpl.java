package com.javafx.model.service;

import com.javafx.model.domain.users.BusinessUser;
import com.javafx.model.domain.users.PersonalUser;
import com.javafx.model.storage.Storage;
import com.javafx.model.storage.StorageImpl;

public class StorageServiceImpl implements StorageService {

    Storage storage = new StorageImpl();

    @Override
    public void savePersonalUser(PersonalUser personalUser) {

        storage.savePersonalUser(personalUser);

        System.out.println("saved personal user"+personalUser);
    }

    @Override
    public void saveBusinessUser(BusinessUser businessUser) {

        storage.saveBusiness(businessUser);

        System.out.println("saved personal user" + businessUser);
    }

}
