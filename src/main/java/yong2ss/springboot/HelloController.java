package yong2ss.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@RequestMapping
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    @ResponseBody //없이 String return하면 dispatcherServlet이 view page를 찾음
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
