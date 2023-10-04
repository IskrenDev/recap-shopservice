package org.example;

import java.util.List;

public class OrderMapRepo implements OrderRepo {
    private OrderListRepo orderListRepo;

    public OrderMapRepo(List<Order> orders) {
        this.orderListRepo = new OrderListRepo(orders);
    }
    @Override
    public void addOrder(Order order) {
        orderListRepo.addOrder(order);
    }

    @Override
    public void removeOrder(String id) {
        orderListRepo.removeOrder(id);
    }

    @Override
    public Order findOrder(String id) {
        orderListRepo.findOrder(id);
        return null;
    }
}
