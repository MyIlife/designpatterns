package com.example.designpatterns.singleton;

public class DoubleLockSingleton {
    // volatile 保证了创建实例顺序性（禁止指令重排序）
    //在java内存模型中，volatile 关键字作用可以是保证可见性或者禁止指令重排。这里是因为 singleton = new Singleton() ，
    // 它并非是一个原子操作，事实上，在 JVM 中上述语句至少做了以下这 3 件事：
    //    1.给 singleton 分配内存空间；
    //    2.开始调用 Singleton 的构造函数等，来初始化 singleton；
    //    3.将 singleton 对象指向分配的内存空间（执行完这步 singleton 就不是 null 了）。
    // 指令重排序的结果可能是：1-2-3，也可能是1-3-2
    //如果一个线程执行1-3，后有个新的线程过来判断该对象已经不为null，那么就直接得到这个未经过2步骤的对象（未初始化），
    // 直接被拿出去使用导致程序报错
    private static volatile DoubleLockSingleton doubleLockSingleton = null;
    private DoubleLockSingleton(){

    }
    private static DoubleLockSingleton getInstance() {
        //先判断实例是否已经存在，这里不用上锁（锁的细化）
        if(doubleLockSingleton == null){
            // 如果实例不存在，那么上锁
            synchronized (DoubleLockSingleton.class){
                // 这里再次判断的原因是：假设有三个线程同时访问，都判断实例不存在，
                // 而此时只有一个线程获得锁，当此线程释放锁之后，实例已经存在了，
                // 如果其他线程获得锁后会再次new一个实例，就不是单例了
                if(doubleLockSingleton==null){
                    doubleLockSingleton=  new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
