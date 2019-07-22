package patterns.creational.singleton.threadlocal;


/**
 * 线程间单例模式--伪线程安全
 *
 * 使用场景：多数据源时每个线程使用一个数据源的实例，实现动态切换
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL_INSTANCE.get();
    }
}
