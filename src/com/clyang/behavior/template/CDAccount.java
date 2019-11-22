package com.clyang.behavior.template;

/**
 * @ClassName CDAccount
 * @Description CDAccount
 * @Author Administrator
 * @Date 2019/11/22 16:37
 */
public class CDAccount extends Acount {
    @Override
    protected String doCalculateAcountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
