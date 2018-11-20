package com.airhacks.ping.boundary;

import com.airhacks.ping.entity.Snoer;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @Inject
    SnoerWinkel snoerWinkel;

    @GET
    public List<Snoer> ping() {
        return this.snoerWinkel.all();
    }
    @GET
    @Path("{id}")
    public Snoer find(@PathParam("id") int id) {
        return new Snoer(id, "blauw");
    }

    @POST
    public void save(Snoer snoer) {
        this.snoerWinkel.save(snoer);
    }


}
