package org.example;

public record Product(

        String productID,

        String productName,

        String productCategory,

        double productPrice
) {
        String withID() {
            return productID;
        }
}
