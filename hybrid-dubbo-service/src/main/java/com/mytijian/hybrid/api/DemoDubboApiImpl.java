package com.mytijian.hybrid.api;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

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
@DubboService(protocol = { "dubbo", "rest"}, timeout = 5000)
@Path("/")
public class DemoDubboApiImpl implements DemoDubboApi {

    @Override
    @Path("echo/{string}")
    @GET
    public String echo(@PathParam("string") String string) {
        return "Hello Dubbo: " + string;
    }
}