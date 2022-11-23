package com.example.marketspring.Controller;

import com.example.marketspring.Component.Cart;
import com.example.marketspring.Service.MarketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketController{

    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = new MarketService();
    }

    @PostMapping ("/store/order/add")
    public String addProduct(@RequestParam("id") List<Integer> ids) {
        return marketService.addToCart(ids);
    }

    @GetMapping("/store/order/get")
    public Cart getProduct() {
        return marketService.getCart();
    }
}
