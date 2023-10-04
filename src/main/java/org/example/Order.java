package org.example;

public record Order (
        String orderID,
        double orderPrice
)

{
    String withID() {
        return orderID;
    }
}
