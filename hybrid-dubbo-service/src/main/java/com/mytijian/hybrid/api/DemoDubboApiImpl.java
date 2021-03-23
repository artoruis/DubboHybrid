package com.mytijian.hybrid.api;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Payne.Liu
 * @version 1.0
 * @description TODO
 * @create 2021-03-22 20:50
 * @see
 */
@DubboService
public class DemoDubboApiImpl implements DemoDubboApi {

    @Override
    public String echo(String string) {
        return "Hello Dubbo: " + string;
    }
}