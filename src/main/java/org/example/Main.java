package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo(products);

        Product product1 = new Product("1","Hammer", "Instruments", 35.60);
        Product product2 = new Product("2","Phone holder", "Car accessories", 20.49);

        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        System.out.println(productRepo);

        System.out.println(productRepo.findProduct("3"));
        productRepo.removeProduct("3");

        //System.out.println(productRepo.getProducts());
    }
}