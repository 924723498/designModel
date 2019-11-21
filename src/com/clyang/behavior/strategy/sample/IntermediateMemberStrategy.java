package com.clyang.behavior.strategy.sample;

/**
 * 中级级
 */
public class IntermediateMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣 10%");
        return booksPrice*0.9;
    }
}
