package org.example;

import java.util.List;

public record Order (
        List<Product> products,
        String orderID,
        double orderPrice
)

{
    String withID() {
        return orderID;
    }
}
