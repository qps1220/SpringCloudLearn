package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qps on 2019/4/17.
 *
 */
@RestController
public class RefactorController implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello"+name;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello"+user.getName()+","+user.getAge();
    }



}
