package testCases;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportPrac {
	public static ExtentReports extent;
	public static ExtentTest logger;

	@BeforeTest
	public void beforCall() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);

		extent.addSystemInfo("Host Name", "ankit")// InetAddress.getLocalHost().getHostName())
				.addSystemInfo("Environment", new Object() {
				}.getClass().getName()).addSystemInfo("User Name", System.getProperty("user.name"));
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}

	@AfterTest
	public void afterCall() {
		extent.flush();
	}

	@Test
	public void passTest() {
		logger = extent.startTest((new Object() {}.getClass().getEnclosingMethod().getName()));
		Assert.assertTrue(true);
		//logger.log(LogStatus.PASS, "TestCase has Passed");
	}

	@Test
	public void failTest() {
		logger = extent.startTest((new Object() {}.getClass().getEnclosingMethod().getName()));
		Assert.assertTrue(false);
		logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	}
	
	@Test
	public void skipTest() {
		logger = extent.startTest((new Object() {}.getClass().getEnclosingMethod().getName()));
		throw new SkipException("Skipping - This is not ready for testing ");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, "Test Case pass is " + result.getName());
		}
		extent.endTest(logger);
	}
}
