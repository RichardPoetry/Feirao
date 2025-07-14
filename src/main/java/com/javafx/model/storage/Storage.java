package com.javafx.model.storage;

import com.javafx.model.domain.product.OrderList;
import com.javafx.model.domain.users.BusinessUser;
import com.javafx.model.domain.users.PersonalUser;


public interface Storage {

    void savePersonalUser(PersonalUser personalUser);

   void saveBusiness(BusinessUser businessUser);

}
