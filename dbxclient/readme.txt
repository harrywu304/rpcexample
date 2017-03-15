1、一般来说，Java应用应该使用最高效的dubbo协议访问；
2、如果是非java应用可以使用接口的restful映射url；
3、dubbo客户端要访问一些非dubbo的restful接口，可以由调用方为这些接口编制符合jax-rs规范的rest代理接口，
   然后dubbo客户端使用rest协议来访问这些restful接口；这样可以大大方便客户端访问；
   
参考：
https://dangdangdotcom.github.io/dubbox/rest.html