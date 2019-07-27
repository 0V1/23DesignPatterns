package patterns.structural.proxy.dynamicproxy.cglibdynamic;


/**
 * CGLib 动态代理测试
 */
public class Test {

	public static void main(String[] args) {
		Source proxy = (Source)new SourceProxy().createProxyObject(Source.class);

		proxy.method();

	}
}
