package patterns.structural.proxy.dynamicproxy.jdkdynamic;

/**
 * 被代理类
 */
public class Source implements Sourceable {

    public void method() {
        System.out.println("------------>Source.method()");
    }
}
