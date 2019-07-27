package patterns.structural.proxy.staticproxy;

/**
 * @ClassName: SourceProxy
 * @Description: 代理模式：
 * 代理模式就是多一个代理类出来，替原对象进行一些操作
 */
public class Proxy implements Sourceable {

    /**
     * 实现同一接口，持有被代理对象
     */
    private Sourceable source = new Source();

    /**
     * 代理方法，对原方法进行代理调用
     */
    public void method() {
        before();

        source.method();

        after();
    }

    public static void before() {
        System.out.println("before() do it before....");

    }

    public static void after() {
        System.out.println("after() do it before....");

    }
}
