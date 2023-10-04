package org.example;

import java.util.List;
import java.util.Objects;

public class ShopService {

    String orderItem;
    int numberOfOrderedItems;

    public ShopService(String orderItem, int numberOfOrderedItems) {
        this.orderItem = orderItem;
        this.numberOfOrderedItems = numberOfOrderedItems;
    }

    public boolean placeOrder(ProductRepo productRepo) {
        List<Product> products = productRepo.getProducts();
            for (Product product : products) {
                if (orderItem.equals(product.withName())) {
                    System.out.println("Order has been placed.");
                }
            }
        System.out.println("Product not found.");
        return false;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public int getNumberOfOrderedItems() {
        return numberOfOrderedItems;
    }

    public void setNumberOfOrderedItems(int numberOfOrderedItems) {
        this.numberOfOrderedItems = numberOfOrderedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return numberOfOrderedItems == that.numberOfOrderedItems && Objects.equals(orderItem, that.orderItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItem, numberOfOrderedItems);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orderItem='" + orderItem + '\'' +
                ", numberOfOrderedItems=" + numberOfOrderedItems +
                '}';
    }
}
