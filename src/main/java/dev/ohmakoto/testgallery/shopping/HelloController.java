package dev.ohmakoto.testgallery.shopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello!";
    }

    @GetMapping("/")
    public String index() {
        return "Index!";
    }
}
