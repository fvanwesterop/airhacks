/*
 */
package com.airhacks.snoer.ping.boundary;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class SnoerIT {

    private Client client;
    private WebTarget tut;

    @Before
    public void initClient() {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/snoer/resources/ping");
    }

    @Test
    public void snoeren() {
        JsonObject snoer = this.tut.path("21").request().get(JsonObject.class);
        System.out.println(" -- " + snoer);
    }

}
