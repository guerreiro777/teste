package br.com.bb.prova.integration;

import br.com.bb.prova.dto.ListMoedasDTO;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@Traced
@Path("/v1/odata")
@RegisterRestClient
public interface CotacaoDolar {

    @GET
    @Path("/Moedas")
    ListMoedasDTO moedas(@QueryParam("format") String type);

    @GET
    @Path("/CotacaoDolarPeriodo")
    public List<Object> cotacao(@QueryParam("dtInicio") String dtInicio, @QueryParam("dtFim") String dtFim,
                                @QueryParam("format") String type);

}
