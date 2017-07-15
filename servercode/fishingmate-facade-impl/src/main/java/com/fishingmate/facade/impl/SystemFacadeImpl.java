package com.fishingmate.facade.impl;

import com.fishingmate.facade.SystemFacade;
import com.fishingmate.infrastructure.util.NetUtil;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2017/7/9/009.
 */
@Component("systemFacade")
@Path("/")
public class SystemFacadeImpl implements SystemFacade {

    @GET
    @Path("/version")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public String version() {
        return "{"
                + "\"ip\":\"" + NetUtil.getHostIp() + "\","
                + "\"1.0.1\":\"2017-07-09.1 first deploy.\","
                + "\"1.0.2\":\"2017-07-15.1 add create fishing map api.\""
                + "}";
    }
}
