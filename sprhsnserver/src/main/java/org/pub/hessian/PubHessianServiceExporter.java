package org.pub.hessian;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.util.NestedServletException;

public class PubHessianServiceExporter extends HessianServiceExporter{
	
	private static final Logger logger = LoggerFactory.getLogger(PubHessianServiceExporter.class); 

    @Override  
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
    	logger.debug("getParameterMap:{}", request.getParameterMap());
    	logger.debug("remote ip:{}", request.getRemoteAddr());
        String auth = request.getHeader("Authorization");
        logger.debug("Authorization:{}", auth);
        if(auth != null){
        	String nameAndPwdBase64Str = auth.split(" ")[1];
        	byte[] nameAndPwdBytes = Base64.getDecoder().decode(nameAndPwdBase64Str);
        	String nameAndPwdStr = new String(nameAndPwdBytes,"utf8");
        	String[] nameAndPwdStrArr = nameAndPwdStr.split(":",2);
        	logger.debug("username:{}", nameAndPwdStrArr[0]);
        	RequestContext.setAppId(nameAndPwdStrArr[0]);
        	if(nameAndPwdStrArr.length == 2){
        		logger.debug("password:{}", nameAndPwdStrArr[1]);
        	}
        	//TODO check auth 
        }
        
        response.setContentType(CONTENT_TYPE_HESSIAN);  
        try{
        	RequestContext.setRequest(request);
        	super.handleRequest(request, response);  
        } catch(Exception e){
        	logger.error("PubHessianServiceExporter handleRequest throw exception", e);
        	throw new NestedServletException("PubHessianServiceExporter handleRequest throw exception", e);  
        } finally{
        	RequestContext.clear();
        }
        
    }  	
}
