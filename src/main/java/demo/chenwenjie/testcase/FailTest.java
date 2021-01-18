package demo.chenwenjie.testcase;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

/**
 * @author chenwenjie.star
 * @date 2021/1/18 6:26 下午
 */
public class FailTest {

    @Test(retryAnalyzer = TestngRetry.class)
    public void failTest1(ITestContext ctx) throws Exception {
        Assert.fail("fail");
    }

    @Test(retryAnalyzer = TestngRetry.class)
    public void failTest2() throws Exception {
        Assert.fail("fail");
    }
}
