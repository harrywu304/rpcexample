package org.pub.hello.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pub.hello.HelloService;
import org.pub.hello.bean.User;

@Path("hello")
public class HelloServiceImpl implements HelloService {

	
	@Override
    @GET
    @Path("sayhello/{name}")
	@Produces({MediaType.APPLICATION_JSON})
	public String sayHello(@PathParam("name") String name) {
		return "Hello " + name;
	}

	@Override
    @POST
    @Path("saygoodbye")
    @Consumes({MediaType.APPLICATION_JSON})	
	public String sayGoodbye(User user) {
		String name = user.getName();
		return "Goodbye " + name;
	}

}
