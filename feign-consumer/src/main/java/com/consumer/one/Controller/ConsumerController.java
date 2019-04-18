package com.consumer.one.Controller;

import com.consumer.one.Model.User;
import com.consumer.one.Service.HelloService;
import com.consumer.one.Service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qps on 2019/4/16.
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;
    @Autowired
    RefactorHelloService refactorHelloService;
    @RequestMapping(value = "feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
    StringBuilder sb= new StringBuilder();
    sb.append(helloService.hello()).
            append("\n").append(helloService.hello("QPS"))
            .append("\n").append(helloService.hello("QPS",30))
            .append("\n").append(helloService.hello(new User("QPS",30)))
            .append("\n");
    return sb.toString();
    }

    @RequestMapping(value = "feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb= new StringBuilder();
        sb.append(refactorHelloService.hello()).
                append("\n").append(refactorHelloService.hello("qps"))
                .append("\n").append(refactorHelloService.hello("qps",26))
                .append("\n").append(refactorHelloService.hello(new com.example.demo.Model.User("qps",26))).append("\n");
        return sb.toString();
    }
}
