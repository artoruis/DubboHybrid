package com.mytijian.hybrid.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("hybrid-dubbo-demo")
public interface DemoDubboApi {
    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable("string") String string);
}
