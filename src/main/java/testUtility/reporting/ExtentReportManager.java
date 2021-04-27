package testutility.reporting;

import java.io.File;

import org.testng.ITestResult;

import testinit.GlobalVariables.TestStatus;

public interface ExtentReportManager {

	public void onStart(File extentReportPath, String projectName, String featureName);

	public void getResult(ITestResult result);

	public void updateResult(TestStatus status, String scenario, String step);

}
