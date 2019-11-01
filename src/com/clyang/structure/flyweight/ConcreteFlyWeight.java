package com.clyang.structure.flyweight;

public class ConcreteFlyWeight implements FlyWeight{
    private Character intrinsicate = null;

    public ConcreteFlyWeight(Character intrinsicate) {
        this.intrinsicate = intrinsicate;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicate);
        System.out.println("Extrinsic State = " + state);
    }
}
