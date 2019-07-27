package patterns.structural.proxy.dynamicproxy.cglibdynamic;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类,
 * 1.CGLib动态代理通过实现MethodInterceptor接口实现intercept方法
 */
public class SourceProxy implements MethodInterceptor {

    /**
     * 2.代理方法调用  通过FastClass调用
     *
     * @param args0
     * @param method
     * @param args2
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object args0, Method method, Object[] args2, MethodProxy methodProxy) throws Throwable {
        before();
        Object aSuper = methodProxy.invokeSuper(args0, args2);
        after();
        return aSuper;
    }

    /**
     * 3.创建代理对象
     *
     * @param clazz
     * @return
     */
    public Object createProxyObject(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public static void before() {
        System.out.println("before() do it before....");

    }

    public static void after() {
        System.out.println("after() do it before....");

    }


}
