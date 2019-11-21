package com.clyang.behavior.strategy.sample;

public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double booksPrice){
        return  this.strategy.calcPrice(booksPrice);
    }
}
