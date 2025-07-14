package com.javafx.model.storage.storageProduct;

import com.javafx.model.domain.product.OrderList;
import com.javafx.model.domain.product.Product;

import java.util.ArrayList;
import java.util.List;

public class StorageProductImpl  implements StorageProduct {

    List<OrderList> orderLists = new ArrayList<>();

    @Override
    public void saveOrderList(OrderList orderList) {
       orderLists.add(orderList);
    }
}
