package org.pub.hessian;

import javax.servlet.ServletRequest;

public class RequestContext {
	
	private static final ThreadLocal<ServletRequest> requestHolder = new ThreadLocal<ServletRequest>();
	
	private static final ThreadLocal<String> appIdHolder = new ThreadLocal<String>();

	private RequestContext() {
	}

	public static void setRequest(ServletRequest request) {
		requestHolder.set(request);
	}

	public static ServletRequest getRequest() {
		return requestHolder.get();
	}

	public static void clear() {
		requestHolder.remove();
	}
	
	public static void setAppId(String appId){
		appIdHolder.set(appId);
	}
	
	public static String getAppId(){
		return appIdHolder.get();
	}
	
	public static String getClientIp(){
		return requestHolder.get().getRemoteAddr();
	}
	
}
