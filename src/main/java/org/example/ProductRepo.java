package org.example;

import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> products;

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProduct(String id) {
        for (Product product: products) {
            if (product.withID().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(String id) {
        if (products.remove(findProduct(id))) {
            System.out.println("Product has been removed.");
        } else {
            System.out.println("Product not found");
        }
    }

    /*public void removeProduct(Product product) {
        products.remove(product);
    } */
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductRepo: {" +
                "products=" + products  +
                '}';
    }
}
