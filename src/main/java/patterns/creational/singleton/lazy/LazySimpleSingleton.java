package patterns.creational.singleton.lazy;

/**
 * 懒汉式单例模式--简单
 */
public class LazySimpleSingleton {

    /**
     * 1.私有的属性，防止通过属性访问,不初始化
     */
    private static LazySimpleSingleton lazySingleton = null;


    /**
     * 2.私有构造函数，防止new出来
     */
    private LazySimpleSingleton() {
    }

    /**
     * 3.全局共有可以访问的方法，统一来获取实例
     * 方法加锁保证线程安全
     *
     * @return
     */
    public static synchronized LazySimpleSingleton getInstance() {
        if (lazySingleton != null) {
            lazySingleton = new LazySimpleSingleton();
        }
        return lazySingleton;
    }

}
