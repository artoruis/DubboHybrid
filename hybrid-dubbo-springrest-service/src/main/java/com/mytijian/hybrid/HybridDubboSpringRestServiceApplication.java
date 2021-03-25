package com.mytijian.hybrid;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HybridDubboSpringRestServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HybridDubboSpringRestServiceApplication.class)
                .run(args);
    }


}
