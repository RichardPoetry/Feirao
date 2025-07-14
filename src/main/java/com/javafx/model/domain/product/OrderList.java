package com.javafx.model.domain.product;

import com.javafx.model.domain.ProductTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

    //    String productName, double price, int quantity, ProductTypeEnum productType
    List<Product> productsSorted = new ArrayList<>();

    //    FRUTAS
    Product apple = new Product("Maçã", 5.99, 0, ProductTypeEnum.FRUTA);
    Product orange = new Product("Laranja", 3.49, 0, ProductTypeEnum.FRUTA);
    Product watermelon = new Product("Melancia", 14.99, 0, ProductTypeEnum.FRUTA);
    Product banana = new Product("Banana", 4.49, 0, ProductTypeEnum.FRUTA);

    //    VERDURAS
    Product cabbage = new Product("Repolho", 3.99, 0, ProductTypeEnum.VERDURA);
    Product onion = new Product("Cebola", 2.99, 0, ProductTypeEnum.VERDURA);
    Product Spinach = new Product("Espinafre", 4.75, 0, ProductTypeEnum.VERDURA);
    Product lettuce = new Product("Alface", 3.99, 0, ProductTypeEnum.VERDURA);

    private List<Product> fullOrderList() {
        List<Product> products = new ArrayList<>();

        products.add(apple);
        products.add(orange);
        products.add(watermelon);
        products.add(banana);
        products.add(cabbage);
        products.add(onion);
        products.add(lettuce);
        products.add(Spinach);

        return products;
    }

    public List<Product> createOrderList(List<Integer> quantities) {

        List<Product> fullOrderList = this.fullOrderList();

        for (int i = 0; i < quantities.size(); i++) {
            fullOrderList.get(i).setQuantity(quantities.get(i));
        }

        List<Product> fullOrderProducts = fullOrderList.stream()
                .filter(e -> e.getQuantity() > 0)
                .toList();

        return fullOrderProducts;

    }
}
