package org.shopping.project.application;

import org.shopping.project.domain.model.CartItem;
import org.shopping.project.domain.model.Product;
import org.shopping.project.domain.model.ProductQuantity;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addItem(Product product, ProductQuantity quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().equals(product)) {
                cartItem = new CartItem(product, new ProductQuantity(cartItem.getQuantity().getQuantity() + quantity.getQuantity()));
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}