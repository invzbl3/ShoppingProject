package org.shopping.project.domain.service;

import org.shopping.project.domain.model.Product;
import org.shopping.project.domain.model.ProductQuantity;
import org.shopping.project.application.ShoppingCart;

public class ShoppingCartService {
    private ShoppingCart shoppingCart;

    public ShoppingCartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addItemToCart(Product product, ProductQuantity quantity) {
        shoppingCart.addItem(product, quantity);
    }

    // Other business logic methods
}