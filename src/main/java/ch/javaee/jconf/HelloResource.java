package ch.javaee.jconf;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}


