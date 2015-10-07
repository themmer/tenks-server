package com.tenks.server.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

/**
 * Created by Tim on 9/24/2015.
 */
public class TenksMetadataResourceTest extends ResourceTest {
    @BeforeMethod
    public void before() throws Exception {
        super.setUp();
    }

    @AfterMethod
    public void after() throws Exception {
        super.tearDown();
    }

    @Override
    protected Application configure() {
        return new ResourceConfig(MetadataResource.class);
    }

    @Test
    public void testMetadata() {
        final String response = target("metadata"). //
                request(MediaType.APPLICATION_JSON).get(String.class);
        assertNotNull(response);
        System.out.println("resp: " + response);

        assertTrue(response.contains("balanceSheet"));
        assertTrue(response.contains("cashFlowStatement"));
        assertTrue(response.contains("incomeStatement"));
    }
}
