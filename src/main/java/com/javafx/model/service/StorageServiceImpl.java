package com.javafx.model.service;

import com.javafx.model.domain.product.OrderList;
import com.javafx.model.domain.product.Product;
import com.javafx.model.domain.users.BusinessUser;
import com.javafx.model.domain.users.PersonalUser;
import com.javafx.model.storage.Storage;
import com.javafx.model.storage.StorageImpl;
import com.javafx.model.storage.storageProduct.StorageProduct;
import com.javafx.model.storage.storageProduct.StorageProductImpl;

import java.util.List;

public class StorageServiceImpl implements StorageService {

    Storage storage = new StorageImpl();
    StorageProduct storageProduct = new StorageProductImpl();
    OrderList orderList = new OrderList();

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

    @Override
    public void createOrderList(List<Integer> quantities) {

       List<Product> quantityProduct = this.orderList.createOrderList(quantities);

       OrderList newOrderList = this.orderList;

       storageProduct.saveOrderList(newOrderList);

        }


    }


