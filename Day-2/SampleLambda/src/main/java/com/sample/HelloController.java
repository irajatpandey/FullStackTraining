package com.sample;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public GreetDto main() {
        GreetDto greetDto =  new GreetDto();
        greetDto.setMessage("Hello");
        return greetDto;
    }
    @PostMapping("/welcome")
    public GreetDto welcome(@RequestBody User user){
        GreetDto greetDto =  new GreetDto();
        String message = "welcome " + user.getName() + " your age " + user.getAge();
        greetDto.setMessage(message);
        return greetDto;
    }
}