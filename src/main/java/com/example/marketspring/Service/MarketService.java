package com.example.marketspring.Service;

import com.example.marketspring.Component.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    private static final Cart cart = new Cart();

    public MarketService() {
    }

    public static String addToCart(List<Integer> ids) {
        cart.addToCart(ids);
        return cart.getCart().toString();
    }

    public Cart getCart() {
        return cart;
    }
}
