package org.pub.mtnclient;

import org.pub.hello.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MtnClient 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        HelloService service = (HelloService) ctx.getBean("remoteService");
        System.out.println(service.sayHello("motan"));
    }
}
