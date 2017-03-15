package org.pub.hello;

import org.pub.hello.bean.User;

public interface HelloService {
	
	public String sayHello(String name);
	
	public String sayGoodbye(User user);

}
