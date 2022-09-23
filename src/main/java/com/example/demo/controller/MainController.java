package com.example.demo.controller;

import com.example.demo.controller.dto.Company;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    private final ProductService productService;

    public MainController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/info")
    public Company available() {
        int count =  productService.getAvailableCount();
        boolean good =  productService.isGoodPartner();
        return new Company(count, good);
    }
}
