package cloudmian.Controller;

import cloudmian.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

/**
 * Created by qps on 2019/4/11.
 */
@RestController
public class Hello {
        /*   @Value("#{'name'}")
          private String name;
          @Value("#{'author'}")
          private String author;
          @Value("#{'desc'}")
          private String desc;*/
        private final Logger logger= Logger.getLogger(String.valueOf(getClass()));

        private EurekaDiscoveryClient client;
        @RequestMapping("/hello")
        public String index() {
           // ServiceInstance instance=client.getLocalServiceInstance();
           // logger.info("/host,host:"+instance.getHost()+"service_id"+instance.getServiceId());
            return "Hello World";
}

      @RequestMapping(value = "/hello1",method = RequestMethod.GET)
      public String hello(@RequestParam String name){
            return "HELLO" +name;
      }
      @RequestMapping(value = "/hello2",method = RequestMethod.GET)
      public User hello(@RequestHeader String name,@RequestHeader Integer age){
            return new User(name,age);
      }
      @RequestMapping(value = "/hello3",method = RequestMethod.POST)
      public String hello(@RequestBody User user){
            return "HELLO" +user.getName()+user.getAge();
      }
    }
