package com.javafx.model.service;

import com.javafx.model.domain.users.BusinessUser;
import com.javafx.model.domain.users.PersonalUser;

public interface StorageService {

    void savePersonalUser(PersonalUser personalUser);

    void saveBusinessUser(BusinessUser businessUser);
}
