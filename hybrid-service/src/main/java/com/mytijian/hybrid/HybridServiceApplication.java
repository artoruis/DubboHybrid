package com.mytijian.hybrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HybridServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HybridServiceApplication.class, args);
    }


}
