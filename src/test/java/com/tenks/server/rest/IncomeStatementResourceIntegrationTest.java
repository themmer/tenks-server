package com.tenks.server.rest;

import com.tenks.client.rest.util.TenKsConstants;
import org.glassfish.jersey.server.ResourceConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Income Statement Resource Tester.
 *
 * @author Tim Hemmer
 * @version 1.0
 * @since <pre>Jul 21, 2015</pre>
 */
public class IncomeStatementResourceIntegrationTest extends ResourceTest {

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
        return new ResourceConfig(IncomeStatementResource.class);
    }

    @Test
    public void testIncomeStatement() {
        final String response = target("income").queryParam(TenKsConstants.SymbolTicker, "MSFT"). //
            request(MediaType.APPLICATION_JSON).get(String.class);
        assertNotNull(response);
        assertTrue(response.contains("totalRevenue"));
    }
}