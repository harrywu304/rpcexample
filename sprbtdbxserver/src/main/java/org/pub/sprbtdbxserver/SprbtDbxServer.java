package org.pub.sprbtdbxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SprbtDbxServer {

    
    public static void main( String[] args )
    {
    	SpringApplication.run(SprbtDbxServer.class, args);
    }

}
