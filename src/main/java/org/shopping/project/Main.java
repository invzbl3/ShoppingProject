package org.shopping.project;

import org.shopping.project.application.ShoppingCart;
import org.shopping.project.domain.model.CartItem;
import org.shopping.project.domain.model.Product;
import org.shopping.project.domain.model.ProductQuantity;

/**
 * ShoppingProject prototype
 *
 */
public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Smartphone", 499.99);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(laptop, new ProductQuantity(2));
        shoppingCart.addItem(phone, new ProductQuantity(3));

        System.out.println("Shopping Cart Items:");
        for (CartItem cartItem : shoppingCart.getCartItems()) {
            Product product = cartItem.getProduct();
            ProductQuantity quantity = cartItem.getQuantity();
            System.out.println(product.getName() +
                    " - Quantity: " + quantity.getQuantity() +
                    " - Price per unit: €" + product.getPrice() +
                    " - Subtotal: €" + (quantity.getQuantity() * product.getPrice()));
        }
    }
}