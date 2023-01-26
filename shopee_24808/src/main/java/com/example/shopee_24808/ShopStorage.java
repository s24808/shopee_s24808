package com.example.shopee_24808;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopStorage {
    private final List<Cart> cartList = new ArrayList<>();

    public ShopStorage() {
        cartList.add(new Cart(new Client("1", 300) ,200, "mleko"));
        cartList.add(new Cart(new Client("2", 300) ,300, "masło"));
        cartList.add(new Cart(new Client("3", 300) ,400, "jogurt"));
    }

    public void addCart(Cart cart) {
        this.cartList.add(cart);
    }

    public List<Cart> getCartList() {
        return cartList;
    }
    public Cart getItemByName(String item_name) {
        for (Cart cart : cartList) {
            if (cart.getItem_name() == item_name) {
                return cart;
            }
        }

        return null;
}}
