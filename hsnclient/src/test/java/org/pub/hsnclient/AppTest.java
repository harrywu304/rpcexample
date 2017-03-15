package org.pub.hsnclient;

import java.net.MalformedURLException;

import org.junit.Test;
import org.pub.hello.HelloService;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testApp() throws MalformedURLException
    {
        String url = "http://localhost:8080/hsnserver/hello";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        HelloService d = (HelloService) factory.create(HelloService.class, url);  
        System.out.println(d.sayHello("demo"));
        
    }
}
