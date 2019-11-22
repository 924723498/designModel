package com.clyang.behavior.template;

/**
 * @ClassName MoneyMarketAccount
 * @Description MoneyMarketAccount
 * @Author Administrator
 * @Date 2019/11/22 16:37
 */
public class MoneyMarketAccount extends Acount {
    @Override
    protected String doCalculateAcountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
