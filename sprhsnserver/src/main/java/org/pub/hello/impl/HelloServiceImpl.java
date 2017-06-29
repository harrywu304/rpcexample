package org.pub.hello.impl;

import java.util.HashMap;
import java.util.Map;

import org.pub.hello.HelloService;
import org.pub.hello.bean.User;
import org.pub.hessian.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class); 

	@Override
	public String sayHello(String name) {
		logger.debug("name:{}", name);
		logger.debug("appId:{}", RequestContext.getAppId());
		logger.debug("client ip:{}", RequestContext.getClientIp());
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
