package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        ProductRepo productRepo = new ProductRepo(products);

        List<Order> orders = new ArrayList<>();
        OrderListRepo orderListRepo = new OrderListRepo(orders);

        Product product1 = new Product("1","Hammer", "Instruments", 35.60);
        Product product2 = new Product("2","Phone holder", "Car accessories", 20.49);

        Order order1 = new Order("001", 91.69);
        Order order2 = new Order("002", 147.78);

        productRepo.addProduct(product1);
        productRepo.addProduct(product2);

        orderListRepo.addOrder(order1);
        orderListRepo.addOrder(order2);

        System.out.println(productRepo);

        System.out.println(orderListRepo);

        System.out.println(productRepo.findProduct("3"));
        productRepo.removeProduct("3");

        System.out.println(orderListRepo.findOrder("001"));
        orderListRepo.removeOrder("001");
    }
}