package com.clyang.behavior.template;

/**
 * @ClassName Client
 * @Description Client
 * @Author Administrator
 * @Date 2019/11/22 16:39
 */
public class Client {
    public static void main(String[] args) {
        Acount acount = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + acount.calculateInterest());
        acount = new CDAccount();
        System.out.println("定期账号的利息数额为：" + acount.calculateInterest());
    }
}
