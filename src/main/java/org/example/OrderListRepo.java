package org.example;

import java.util.List;
import java.util.Objects;

public class OrderListRepo {
    private List<Order> orders;

    public OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order findOrder(String id) {
        for (Order order: orders) {
            if (order.withID().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public void removeOrder(String id) {
        if (orders.remove(findOrder(id))) {
            System.out.println("Order has been removed.");
        } else {
            System.out.println("Order not found");
        }
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
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "OrderListRepo: {" +
                "orders=" + orders +
                '}';
    }
}