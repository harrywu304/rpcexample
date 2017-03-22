package org.pub.hello;

import java.util.Map;

import org.pub.hello.bean.User;

public interface HelloService {
	
	public String sayHello(String name);
	
	public Map sayGoodbye(String name);
	
	public User echo(User user);
	

}
