package Base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Itest extends Baseclass implements ITestListener   {

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
		try {
			//wd2.takeScreenshot(Baseclass.sd,result.getName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./extentReport.html");
		
		htmlreport.config().setDocumentTitle("vtiger");
		
		
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
