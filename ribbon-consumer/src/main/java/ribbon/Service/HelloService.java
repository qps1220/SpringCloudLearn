package ribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qps on 2019/4/15.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod="helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }
    public String helloFallback(){
        return "error";
    }
}
