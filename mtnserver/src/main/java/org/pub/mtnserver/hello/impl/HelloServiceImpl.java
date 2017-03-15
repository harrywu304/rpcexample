package org.pub.mtnserver.hello.impl;

import org.pub.hello.HelloService;
import org.pub.hello.bean.User;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	public String sayGoodbye(User user) {
		String name = user.getName();
		return "Goodbye " + name;
	}

}
