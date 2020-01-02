package com.jlog.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DemoAPI {

    @GetMapping("/value")
    public Mono<String> value() {
        return Mono.just("value");
    }
}
