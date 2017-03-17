package org.pub.sprbthessian;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//加载特定spring配置
@ImportResource(locations={"classpath:spring-hessian.xml"})
public class AppConfig {

}
