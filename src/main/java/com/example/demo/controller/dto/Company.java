package com.example.demo.controller.dto;

public class Company {
    private int productCount;
    private boolean goodPartner;

    public Company(int productCount, boolean goodPartner) {
        this.productCount = productCount;
        this.goodPartner = goodPartner;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public boolean isGoodPartner() {
        return goodPartner;
    }

    public void setGoodPartner(boolean goodPartner) {
        this.goodPartner = goodPartner;
    }
}
