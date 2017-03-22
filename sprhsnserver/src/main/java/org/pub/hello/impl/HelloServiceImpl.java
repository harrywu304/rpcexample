package org.pub.hello.impl;

import java.util.HashMap;
import java.util.Map;

import org.pub.hello.HelloService;
import org.pub.hello.bean.User;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	public Map sayGoodbye(String name) {
		Map<String,String> rt = new HashMap<String,String>();
		rt.put("echo", "Goodbye " + name);
		return rt;
	}

	@Override
	public User echo(User user) {
		user.setName("demo");
		return user;
	}

}
