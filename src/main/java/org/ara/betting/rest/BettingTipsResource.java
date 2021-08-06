package org.ara.betting.rest;

import org.ara.betting.service.BettingService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/betting")
public class BettingTipsResource {

    @Inject
    BettingService bettingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{fromNumber}/{toNumber}/{antallNumber}")
    public Response getBettingNumberRandom(
            @PathParam("fromNumber") int fromNumber,
            @PathParam("toNumber") int toNumber,
            @PathParam("antallNumber") int antallNumber
    ) {
        return bettingService.getBettingNumberByRandom(fromNumber, toNumber, antallNumber);
    }

}