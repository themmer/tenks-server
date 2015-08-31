package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarFinancialRequestType;
import com.tenks.dto.BalanceSheetConsolidated;
import com.tenks.dto.CashFlowStatementConsolidated;
import com.tenks.dto.IncomeStatementConsolidated;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * EdgarRestClient Tester.
 *
 * @author Tim Hemmer
 * @version 1.0
 * @since <pre>Jul 23, 2015</pre>
 */
public class EdgarRestClientIntegrationTest {

    // TODO lets use injection for this type of stuff
    private EdgarBalanceSheetClient edgarBalanceSheetRestClient = new EdgarBalanceSheetRestClientImpl();
    private EdgarIncomeStatementClient edgarIncomeStatementRestClient = new EdgarIncomeStatementRestClientImpl();
    private EdgarCashFlowStatementClient edgarCashFlowStatementRestClient = new EdgarCashFlowStatementRestClientImpl();

    /**
     * Method: testExecuteBalanceSheetConsolidated()
     */
    @Test
    public void testExecuteBalanceSheetConsolidated() throws Exception {
        EdgarFinancialRequest edgarFinancialRequest = new EdgarFinancialRequest(EdgarFinancialRequestType.BalanceSheetConsolidated, "MSFT");
        BalanceSheetConsolidated balanceSheetConsolidated = edgarBalanceSheetRestClient.getBalanceSheet(edgarFinancialRequest);
        assertNotNull(balanceSheetConsolidated);
    }

    /**
     * Method: testExecuteIncomeStatementConsolidated()
     */
    @Test
    public void testExecuteIncomeStatementConsolidated() throws Exception {
        EdgarFinancialRequest edgarFinancialRequest = new EdgarFinancialRequest(EdgarFinancialRequestType.IncomeStatementConsolidated, "MSFT");
        IncomeStatementConsolidated incomeStatementConsolidated = edgarIncomeStatementRestClient.getIncomeStatement(edgarFinancialRequest);
        assertNotNull(incomeStatementConsolidated);
    }

    /**
     * Method: testExecuteCashFlowStatementConsolidated()
     */
    @Test
    public void testExecuteCashFlowStatementConsolidated() throws Exception {
        EdgarFinancialRequest edgarFinancialRequest = new EdgarFinancialRequest(EdgarFinancialRequestType.CashFlowStatementConsolidated, "MSFT");
        CashFlowStatementConsolidated cashFlowStatementConsolidated = edgarCashFlowStatementRestClient.getCashFlowStatement(edgarFinancialRequest);
        assertNotNull(cashFlowStatementConsolidated);
    }

    /**
     * Method: testMultiThreadCashFlowStatementConsolidated()
     * Each registered key can handle up to 2 requests per second
     */
    @Test(threadPoolSize = 2, invocationCount = 2,  timeOut = 15000)
    public void testMultiThreadCashFlowStatementConsolidated() throws Exception {
        EdgarFinancialRequest edgarFinancialRequest = new EdgarFinancialRequest(EdgarFinancialRequestType.CashFlowStatementConsolidated, "MSFT");
        CashFlowStatementConsolidated cashFlowStatementConsolidated = edgarCashFlowStatementRestClient.getCashFlowStatement(edgarFinancialRequest);
        assertNotNull(cashFlowStatementConsolidated);
    }


    // TODO make sure this fails with the last plan
    /**
     * Method: testMultiThreadException()
     * Each registered key can handle up to 2 requests per second
     */

//    @Test(threadPoolSize = 3, invocationCount = 3,  timeOut = 15000, expectedExceptions = AssertionError.class)
    public void testMultiThreadException() throws Exception {
        EdgarFinancialRequest edgarFinancialRequest = new EdgarFinancialRequest(EdgarFinancialRequestType.CashFlowStatementConsolidated, "MSFT");
        CashFlowStatementConsolidated cashFlowStatementConsolidated = edgarCashFlowStatementRestClient.getCashFlowStatement(edgarFinancialRequest);
        assertNotNull(cashFlowStatementConsolidated);
    }
} 
