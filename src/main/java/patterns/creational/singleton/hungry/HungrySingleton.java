package patterns.creational.singleton.hungry;

/**
 * 饿汉式单例模式
 */
public class HungrySingleton {

    /**
     * 1.私有的属性，防止通过属性访问
     */
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    /**
     * 2.私有构造函数，防止new出来
     */
    private HungrySingleton() {
    }

    /**
     * 3.全局共有可以访问的方法，统一来获取实例
     *
     * @return
     */
    public static HungrySingleton getInstance() {
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
