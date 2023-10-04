package org.example;

import java.util.List;
import java.util.Objects;

public class ShopService {

    private List<Order> orders;

    public ShopService(List<Order> orders) {
        this.orders = orders;
    }

    public boolean placeOrder(Order order) {
        orders.add(order);
        order.products();
        for (Product product : order.products()) {
            if (order.equals(product.withName())) {
                System.out.println("Order has been placed.");
            }
        }
        System.out.println("Product not found.");
        return false;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orders=" + orders +
                '}';
    }
}
