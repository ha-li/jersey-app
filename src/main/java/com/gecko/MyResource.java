package com.gecko;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hlieu on 1/6/17.
 */
@Path("myresource")
public class MyResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt () {
        return "Got It";
    }
}
