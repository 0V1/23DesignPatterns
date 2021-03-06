# 代理模式
    > 指为其他对象提供一种代理，以控制对这个对象的访问。
    > 代理对象在客户端和目标对象之间起到中介作用

## 静态代理
    > 显示声明被代理对象，和动态代理最大的区别  是否对代理对象有限制，
    > 静态代理有限制，动态代理没有限制
## 动态代理
    > 在静态代理的基础上解决掉对象限制的问题，可以代理任何对象，
    > 也不必再持有被代理对象,而是通过动态生成一个新对象根据需要代理的类，
    > 然后根据指定的接口包装方法，这里就会产生一个问题（只能代理接口中定义的方法）    

* JDK动态代理实现原理 
    1. 拿到被代理类和接口通过反射获取新的类实例和方法
    2. JDK Proxy类重新成成一个新的类，实现了被代理类所有的接口方法
    3. 动态生成Java代码，把增强代码加入到新生成的代码中
    4. 编译生成新的Java代码的class文件
    5. classLoader加载并重新运行新的Java class，得到新的类就是动态生成的代理类
    6. 综上所述JDK代理必须要依赖接口
    
* CGlib动态代理实现原理
    1. 拿到被代理类通过继承覆写父类的方法进行代理
    2. 使用ASM框架生成新的代理类，生成效率比较低
    3. 通过FastClass机制直接调用，执行效率高

* JDK和CGlib区别
    1. JDK动态代理实现了被代理的接口持有代理类，CGLib是继承被代理类对象
    2. JDK和CGLib都是运行期生成字节码，JDK是直接写class字节码。CGLib使用ASM框架写Class字节码CGLib代理实现更复杂，生成代理类比JDK效率低
    3. JDK调用代理方法，是通过反射机制调用。CGLib通过FastClass机制直接调用方法，CGLib执行效率高
    
---
作业
---
# 适用场景
    * 保护目标对象
    * 增强目标对象
    
#### 1、仿JDK动态代理实现原理，自己手写一遍。
    >


#### 2、思考：为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？

    > 因为JDK代理读取被代理对象的接口作为参数时，是数组形式，数组的最大值为65535，所以有接口个数限制

#### 3、结合自身的业务场景用代理模式进行重构。
