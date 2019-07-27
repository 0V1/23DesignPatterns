package patterns.structural.proxy.dynamicproxy.jdkdynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类,
 * 1.JDK动态代理通过实现InvocationHandler接口实现invoke方法
 */
public class SourceProxy implements InvocationHandler {

    /**
     * 2.持有被代理对象,因为是动态的代理，所以类型定为Object
     */
    private Object source;

    /**
     * 3.代理方法调用  通过反射调用被代理的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        Object result = method.invoke(proxy, args);

        after();
        return result;
    }

    /**
     * 4.创建代理对象
     * @return
     */
    public Object createProxyObject(){
        return Proxy.newProxyInstance(source.getClass().getClassLoader(),source.getClass().getInterfaces(),this);
    }

    public SourceProxy(Object source) {
        this.source = source;
    }


    public static void before() {
        System.out.println("before() do it before....");

    }

    public static void after() {
        System.out.println("after() do it before....");

    }
}
