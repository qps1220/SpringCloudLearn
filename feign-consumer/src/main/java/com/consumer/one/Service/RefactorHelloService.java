package com.consumer.one.Service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by qps on 2019/4/17.
 * 方式二通过继承可以将接口定义从Controller层剥离配合Maven私有库 可以轻易实现接口共享 缺点是需要严格遵守开不原则做好版本兼容问题。
 *
 */
@FeignClient(value = "hello-service")
public interface RefactorHelloService extends com.example.demo.Service.HelloService{
}
