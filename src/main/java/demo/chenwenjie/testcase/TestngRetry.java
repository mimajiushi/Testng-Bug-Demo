package demo.chenwenjie.testcase;

import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

/**
 * @author chenwenjie.star
 * @date 2021/1/18 11:08 上午
 */
public class TestngRetry extends RetryAnalyzerCount {

    public TestngRetry() {
        // set retry count
        setCount(3);
    }

    @Override
    public boolean retryMethod(ITestResult result) {
        System.out.println("Retrying...");
        return !result.isSuccess();
    }
}