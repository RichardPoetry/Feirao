package com.javafx.model.storage;

import com.javafx.model.domain.users.BusinessUser;
import com.javafx.model.domain.users.PersonalUser;

import java.util.ArrayList;
import java.util.List;

public class StorageImpl implements Storage {

    List<PersonalUser> personalUsers = new ArrayList<>();
    List<BusinessUser> businessUsers = new ArrayList<>();

    @Override
    public void savePersonalUser(PersonalUser personalUser) {
        personalUsers.add(personalUser);
    }

    @Override
    public void saveBusiness(BusinessUser businessUser) {
        businessUsers.add(businessUser);
    }

}
