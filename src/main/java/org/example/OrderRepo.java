package org.example;

public interface OrderRepo {
    void addOrder(Order order);
    void removeOrder(String id);
    Order findOrder(String id);
}
