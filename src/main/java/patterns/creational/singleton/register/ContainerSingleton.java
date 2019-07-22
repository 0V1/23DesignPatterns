package patterns.creational.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册单例--容器式
 * spring ioc 即该模式
 */
public class ContainerSingleton {

    /**
     * 1.私有化的全局容器，key为bean的name，value 为bean的唯一单例
     */
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    /**
     * 2.私有化构造器
     */
    private ContainerSingleton() {
    }

    /**
     * 3.通过容器来存储唯一实例，有则返回，无则创建
     * 通过同步代码块保证线程安全
     *
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        synchronized (ioc) {
            if (ioc.containsKey(beanName)) {
                return ioc.get(beanName);
            }

            Object obj = null;
            try {
                obj = Class.forName(beanName).newInstance();
                ioc.put(beanName, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return obj;
        }
    }
}
