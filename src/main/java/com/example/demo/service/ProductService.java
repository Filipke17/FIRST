package com.example.demo.service;

import com.example.demo.repository.GitHubAdapter;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final GitHubAdapter productRepository;

    private final int GoodTreshold = 100;

    public ProductService(GitHubAdapter productRepository) {
        this.productRepository = productRepository;
    }

    public int getAvailableCount(){
        return productRepository.getCount();
    }

    public boolean isGoodPartner() {
        return productRepository.getCount() > GoodTreshold;
    }
}
