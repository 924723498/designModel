package com.clyang.behavior.template;

/**
 * @ClassName Acount
 * @Description Acount
 * @Author Administrator
 * @Date 2019/11/22 16:33
 */
public abstract class Acount {
    /**
     * 模板方法
     * @return
     */
    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String acountType = doCalculateAcountType();
        double amount = calculateAmount(acountType);
        return amount * interestRate;

    }

    protected abstract String doCalculateAcountType();

    protected  abstract double doCalculateInterestRate();
    private double calculateAmount(String accountType){
        /**
         * 省略相关的业务逻辑
         */
        return 7243.00;
    }



}
