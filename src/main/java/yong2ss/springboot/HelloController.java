package yong2ss.springboot;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello" + name;
    }
}
