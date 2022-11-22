package com.example.marketspring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> cart = new LinkedList<>();

    public List<Integer> getCart() {
        return cart;
    }

    public void addToCart(List<Integer> ids) {
        cart.addAll(ids);
    }
}
