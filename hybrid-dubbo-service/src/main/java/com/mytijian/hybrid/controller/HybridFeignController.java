package com.mytijian.hybrid.controller;

import com.mytijian.hybrid.api.DemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Payne.Liu
 * @version 1.0
 * @description TODO
 * @create 2021-03-23 19:36
 * @see
 */
@RestController
public class HybridFeignController {

    @Autowired
    private DemoApi demoApi;

    @GetMapping("/feign/echo")
    public String echo(@RequestParam String echo) {
        return demoApi.echo(echo);
    }

}
