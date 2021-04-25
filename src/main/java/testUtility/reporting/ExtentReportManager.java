package testUtility.reporting;

import java.io.File;

import org.testng.ITestResult;

import testInit.GlobalVariables._status;

public interface ExtentReportManager {

	public void onStart(File extentReportPath, String projectName, String featureName);

	public void getResult(ITestResult result);

	public void updateResult(_status status, String scenario, String step);

}
