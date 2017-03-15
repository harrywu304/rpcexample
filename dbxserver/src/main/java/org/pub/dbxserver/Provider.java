package org.pub.dbxserver;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider 
{
    public static void main( String[] args ) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
 
		//保持主线程不退出，这样在broker断开的情况下consumer就不会退出
        Object lock = new Object();
        synchronized (lock) {
            try {
				lock.wait();
			} catch (InterruptedException e) {
				System.out.println("Provider关闭中...");
			}
        }
    }
}
