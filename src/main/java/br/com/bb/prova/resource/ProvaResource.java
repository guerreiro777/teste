package br.com.bb.prova.resource;

import br.com.bb.prova.integration.CotacaoDolar;
import br.com.bb.prova.properties.ProvaProperties;
import io.micrometer.core.annotation.Counted;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/prova")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProvaResource {

    @Inject
    ProvaProperties properties;

    @Inject
    @RestClient
    CotacaoDolar cotacaoDolar;

    private static final Logger logger = LogManager.getLogger(ProvaResource.class);

    @GET
    @Timed
    public Response hello() {
        return Response.status(Response.Status.OK).entity(properties.hello()).build();
    }

    @GET
    @Timed
    @Path("/moeda")
    @Operation(operationId = "getMoeda")
    @Counted
    public Response cotacao() {
        return Response.status(Response.Status.OK).entity(cotacaoDolar.moedas("json")).build();
    }

    @GET
    @Timed
    @Path("/cotacao")
    @Operation(operationId = "getCotacao")
    @Counted
    public Response cotacao(@PathParam("dtInicio") String dtInicio, @PathParam("dtFim") String dtFim) {
        return Response.status(Response.Status.OK).entity(cotacaoDolar.cotacao(dtInicio, dtFim, "json")).build();
    }
}