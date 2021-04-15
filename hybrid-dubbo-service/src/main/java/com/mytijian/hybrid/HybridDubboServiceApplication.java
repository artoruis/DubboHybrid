package com.mytijian.hybrid;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication()
//@ImportResource("dubbo-*.xml")
public class HybridDubboServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HybridDubboServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }


}
