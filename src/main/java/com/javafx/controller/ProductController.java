package com.javafx.controller;

import com.javafx.model.service.StorageService;
import com.javafx.model.service.StorageServiceImpl;

import java.util.List;

public class ProductController {

    StorageService storageService = new StorageServiceImpl();

    public void createOrderList(List<Integer> quantity) {
       storageService.createOrderList(quantity);
    }



}
