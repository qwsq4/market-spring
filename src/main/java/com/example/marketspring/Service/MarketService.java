package com.example.marketspring.Service;

import com.example.marketspring.Component.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    private final Cart cart;

    public MarketService(Cart cart) {
        this.cart = cart;
    }

    public String addToCart(List<Integer> ids) {
        cart.addToCart(ids);
        return cart.getCart().toString();
    }

    public Cart getCart() {
        return cart;
    }
}
