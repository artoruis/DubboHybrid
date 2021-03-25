package com.mytijian.hybrid.api;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author Payne.Liu
 * @version 1.0
 * @description TODO
 * @create 2021-03-22 20:50
 * @see
 */
@DubboService(protocol = { "dubbo"})
@RestController
public class DemoDubboApiImpl implements DemoDubboApi {

    @Override
    public String echo(String string) {
        return "Hello Dubbo with spring rest: " + string;
    }
}