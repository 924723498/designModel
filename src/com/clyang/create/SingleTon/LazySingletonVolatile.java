package com.clyang.create.SingleTon;

/**
 * 双重检查  利用volatile
 * 不会被本地线程缓存 所有读写都是直接写内存
 */
public class LazySingletonVolatile {
    private volatile  static LazySingletonVolatile instance;

    private LazySingletonVolatile() {
    }

    public static  LazySingletonVolatile getInstance() {
        if (instance == null) {
            synchronized (LazySingletonVolatile.class){
                if(instance ==null){
                    instance = new LazySingletonVolatile();
                }
            }
        }
        return instance;
    }

}
