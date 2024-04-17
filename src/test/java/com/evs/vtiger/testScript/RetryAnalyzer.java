package com.evs.vtiger.testScript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	private int retryCount = 0;
    private static final int maxRetryCount = 3; // Set the maximum number of retries

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying test " + result.getName() + " with status " + getResultStatusName(result.getStatus()) +
                    " for the " + (retryCount + 1) + " time(s).");
            retryCount++;
            return true;
        }
        return false;
    }

    private String getResultStatusName(int status) {
        switch (status) {
            case ITestResult.SUCCESS:
                return "SUCCESS";
            case ITestResult.FAILURE:
                return "FAILURE";
            case ITestResult.SKIP:
                return "SKIP";
            default:
                return "UNKNOWN";
        }
    }

}
