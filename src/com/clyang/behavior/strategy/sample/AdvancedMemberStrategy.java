package com.clyang.behavior.strategy.sample;

/**
 * 高级
 */
public class AdvancedMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣 20%");
        return booksPrice*0.8;
    }
}
