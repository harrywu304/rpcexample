package org.pub.sprhsnclient;

import org.junit.Test;
import org.pub.hello.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
    public void testApp()
    {
        ApplicationContext contex = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
       // 获得客户端的Hessian代理工厂bean  
        HelloService i = (HelloService) contex.getBean("hessianClient");  
       System.out.println(i.sayHello("demo"));  
    }
}
