package patterns.structural.proxy.dynamicproxy.jdkdynamic;


import java.lang.reflect.Proxy;

/**
 * JDK 动态代理测试
 */
public class Test {

	public static void main(String[] args) {
		Sourceable proxy = (Sourceable)new SourceProxy(new Source()).createProxyObject();

		proxy.method();

	}
}
