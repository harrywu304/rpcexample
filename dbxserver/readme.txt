1、在dubbox中multicast注册中心协议失效，consumer会获取不到provider；
2、zookeeper在pom.xml中只能使用3.4.6版本，使用3.4.9版本会失败；

rest协议的server默认是jetty，其他可选tomcat, netty, servlet。
tomcat比较适合生产环境大并发场景。
servlet适合应用部署在外部容器内时。
