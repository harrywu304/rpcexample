package org.pub.dbxclient;

import org.pub.hello.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Consumer 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
 
        HelloService helloService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
        String hello = helloService.sayHello("world"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
    }
}
