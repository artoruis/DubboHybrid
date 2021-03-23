package com.mytijian.hybrid.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("hybrid-demo")
public interface DemoApi {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string);
}
