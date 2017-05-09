package com.tratzlaff.example;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller.
 * These components are easily identified by the @RestController annotation.
 *
 * This GreetingController handles GET requests for /greeting by returning a new instance of the Greeting class.
 *
 * The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.
 * `@RequestMapping` maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

        /*
            The Greeting object must be converted to JSON.
            Thanks to Spring’s HTTP message converter support, you don’t need to do this conversion manually.
            Because Jackson 2 is on the classpath, Spring’s MappingJackson2HttpMessageConverter is automatically
            chosen to convert the Greeting instance to JSON.
         */
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}