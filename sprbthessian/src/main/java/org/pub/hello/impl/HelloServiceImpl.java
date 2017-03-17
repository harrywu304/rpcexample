package org.pub.hello.impl;

import org.pub.hello.HelloService;
import org.pub.hello.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/hello")
public class HelloServiceImpl implements HelloService {

	@Override
	@RequestMapping(value="/sayhello",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	@RequestMapping(value="/saygoodbye",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String sayGoodbye(User user) {
		String name = user.getName();
		return "Goodbye " + name;
	}

}
