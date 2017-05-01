package LifeStats.rest;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by David Franzel on 4/27/2017.
 */
@Path("/api")
public class EndPoints {

    @GET
    @Path("/test")
    @Produces("text/plain")
    public String test(){
        return "Hello World";
    }

}
