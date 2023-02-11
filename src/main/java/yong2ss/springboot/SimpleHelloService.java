package yong2ss.springboot;

public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
