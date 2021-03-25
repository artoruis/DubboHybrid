package com.mytijian.hybrid.controller;

import com.mytijian.hybrid.api.DemoDubboApi;
import org.apache.dubbo.config.annotation.DubboReference;
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
public class HybridDubboController {

    @DubboReference
    private DemoDubboApi demoDubboApi;

    @GetMapping("/dubbo/echo")
    public String echo(@RequestParam String echo) {
        return demoDubboApi.echo(echo);
    }

}
