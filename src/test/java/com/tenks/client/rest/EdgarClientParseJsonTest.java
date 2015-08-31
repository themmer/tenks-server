package com.tenks.client.rest;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

import static org.testng.Assert.assertNotNull;

/**
 * EdgarRestClient Tester.
 *
 * @author Tim Hemmer
 * @version 1.0
 * @since <pre>Jul 23, 2015</pre>
 */
public class EdgarClientParseJsonTest {

    /**
     * Method: testParseBalanceSheetConsolidated()
     */
    @Test
    public void testParseBalanceSheetConsolidated() throws Exception {
        // Get response data
        URL url = EdgarClientParseJsonTest.class.getResource("/responses/BalanceSheetConsolidated.json");
        assertNotNull(url);
        File jsonFile = new File(url.getPath());
        String json = Files.toString(jsonFile, Charsets.UTF_8);
        assertNotNull(json);
        System.out.println(json);


    }

    /**
     * Method: testParseIncomeStatementConsolidated()
     */
    @Test
    public void testParseIncomeStatementConsolidated() throws Exception {
        // Get response data
        URL url = EdgarClientParseJsonTest.class.getResource("/responses/IncomeStatementConsolidated.json");
        assertNotNull(url);
        File jsonFile = new File(url.getPath());
        String json = Files.toString(jsonFile, Charsets.UTF_8);
        assertNotNull(json);
        System.out.println(json);
    }

    /**
     * Method: testParseCashFlowStatementConsolidated()
     */
    @Test
    public void testParseCashFlowStatementConsolidated() throws Exception {
        // Get response data
        URL url = EdgarClientParseJsonTest.class.getResource("/responses/CashFlowStatementConsolidated.json");
        assertNotNull(url);
        File jsonFile = new File(url.getPath());
        String json = Files.toString(jsonFile, Charsets.UTF_8);
        System.out.println(json);
        assertNotNull(json);
    }
} 
