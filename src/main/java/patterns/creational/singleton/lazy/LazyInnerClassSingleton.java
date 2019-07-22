package patterns.creational.singleton.lazy;

/**
 * 懒汉式单例模式--内部类
 * 全程不使用【synchronized】，但是还能线程安全，性能最优，实现方案最完美
 */
public class LazyInnerClassSingleton {


    /**
     * 1.私有构造函数，防止new出来
     */
    private LazyInnerClassSingleton() { }

    /**
     * 2.全局共有可以访问的方法，统一来获取实例
     *  LazyHolder内的逻辑需要等到外部调用的时候才去执行
     *  巧妙的利用了内部类的特性：没有调用该方法的时候，内部类是不会创建的只有调用的时候才会被创建
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.INNER_CLASS_SINGLETON;
    }

    /**
     * 3.内部类
     * 通过内部类的加载顺序，JVM底层的逻辑，完美的避免了线程安全问题
     */
    private static class LazyHolder{

        private static final LazyInnerClassSingleton INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }

}
