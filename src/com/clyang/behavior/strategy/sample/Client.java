package com.clyang.behavior.strategy.sample;

public class Client {
    public static void main(String[] args) {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);

        double quotePrice = price.quote(3000);
        System.out.println(quotePrice);
    }
}
