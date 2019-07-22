* ##熟练掌握单例模式的常见写法。

* ##总结每种单例写法的优、缺点。
    * ###饿汉式单例
        > 在单例类首次加载时就创建实例  
        优点：写法简单，初始化即加载  
        缺点：浪费内存空间
    * ###懒汉式单例
        > 被外部类创建时才创建实例  
        优点：按需加载，延迟加载  
        缺点：线程不安全，需要加synchronized来进行加锁，带来性能问题
    * ###注册式单例
        > 将每一个实例都缓存到统一容器中，使用唯一标识获取实例  
        优点：对象方便管理，懒加载  
        缺点：存在线程安全问题，需要加同步锁，有部分性能损耗
    * ###ThreadLocal单例
        > ThreadLocal 不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全。  
        优点：自带线程安全，可以用作多数据源动态切换  
        缺点：只能保证单个线程中唯一，多线程时不唯一
* ##思考破坏单例模式的方式有哪些？并且归纳总结。
    * ###反射
        > 如何破坏：setAccesssible(true)  
        防止方法：在构造函数中判断实例是否初始化，并抛错
    * ###序列化
        > 如何破坏：通过文件对象流先将实例化对象写进磁盘，然后在读出来
        防止方法：覆写【readResolve】防止对象序列化后再反序列化成不同的对象，JDK考虑到单例被破坏的场景，提前预制该方法
* ##梳理内部类的执行逻辑，并画出时序图。
    ![lazyInnerClassLoader.png](/src/main/java/patterns/creational/singleton/lazy/lazyInnerClassLoader.png,"内部类执行时序图")  


