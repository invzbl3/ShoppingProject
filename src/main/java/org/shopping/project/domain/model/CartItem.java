package org.shopping.project.domain.model;

public class CartItem {
    private Product product;
    private ProductQuantity quantity;

    public CartItem(Product product, ProductQuantity quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public ProductQuantity getQuantity() {
        return quantity;
    }
}