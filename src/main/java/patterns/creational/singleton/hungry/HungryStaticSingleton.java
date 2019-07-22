package patterns.creational.singleton.hungry;

/**
 * 饿汉式单例模式
 */
public class HungryStaticSingleton {


    /**
     * 1.私有的属性，通过静态代码块初始化
     */
    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    /**
     * 2.私有构造函数，防止new出来
     */
    private HungryStaticSingleton() {
    }

    /**
     * 3.全局共有可以访问的方法，统一来获取实例
     *
     * @return
     */
    public static HungryStaticSingleton getInstance() {
        return HUNGRY_SINGLETON;
    }


    /**
     * 通过重写该方法，防止对象序列化后再反序列化成不同的对象
     * JDK考虑到单例被破坏的场景，提前预制该方法
     *
     * @return
     */
    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }


}
