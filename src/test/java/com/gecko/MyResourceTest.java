package com.gecko;

import com.sun.net.httpserver.HttpServer;
import org.junit.Before;

import javax.ws.rs.client.WebTarget;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 1/6/17.
 */
public class MyResourceTest {
    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp () throws Exception {
        //server = Main.startServer ();
    }
}