package com.mytijian.hybrid.api;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author Payne.Liu
 * @version 1.0
 * @description TODO
 * @create 2021-03-22 20:50
 * @see
 */
@RestController
public class DemoApiImpl implements DemoApi {

    @Override
    public String echo(String string) {
        return "Hello Feign: " + string;
    }
}