package com.mytijian.hybrid.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DemoDubboApi {
    public String echo(@PathVariable String string);
}
