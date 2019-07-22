package patterns.creational.singleton.lazy;

/**
 * 懒汉式单例模式--双重检索
 */
public class LazyDoubleCheckSingleton {

    /**
     * 1.私有的属性，防止通过属性访问,不初始化
     * ***volatile 防止多线程指令重排序***
     */
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;


    /**
     * 2.私有构造函数，防止new出来
     */
    private LazyDoubleCheckSingleton() {
        /**
         * 通过在构造函数中判断属性是否实例化，防止反射构造函数然后构建不同的对象
         */
        if(lazySingleton != null){
            throw new RuntimeException("不能通过构造函数构建！ ");
        }
    }

    /**
     * 3.全局共有可以访问的方法，统一来获取实例
     * 双重检查锁
     *
     *  CPU执行的时候会转换成JVM的指令执行
     *  指令重排序的问题，解决办法：属性加【volatile】关键字
     *  1.分配内存给这个对象
     *  2.初始化对象
     *  3.将初始化好的对象和内存地址建立关联，赋值
     *  4.用户初次访问
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton != null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton != null) {
                    lazySingleton = new LazyDoubleCheckSingleton();

                }
            }
        }
        return lazySingleton;
    }

}
