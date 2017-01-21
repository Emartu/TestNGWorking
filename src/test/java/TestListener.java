import org.testng.*;

public class TestListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult iTestResult) {}

    @Override
    public void onTestStart(ITestResult iTestResult) {System.out.println("Test execution is started: " + iTestResult.getName());}

    @Override
    public void onTestFailure(ITestResult iTestResult) {System.out.println(" Test execution is failed: " + iTestResult.getName());}

    @Override
    public void onTestSkipped(ITestResult iTestResult) {System.out.println("Test is skipped: " + iTestResult.getName());}

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {}

    @Override
    public void onStart(ITestContext iTestContext) {}

    @Override
    public void onFinish(ITestContext iTestContext) {}
}
