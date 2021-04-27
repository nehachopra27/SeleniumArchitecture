package testutility.reporting;

import java.io.File;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testinit.GlobalVariables;

public class ExtentReportManagerAPI extends GlobalVariables implements ExtentReportManager {

	public synchronized void onStart(File extentReportPath, String projectName, String featureName) {
		sparkReport = new ExtentSparkReporter(extentReportPath);
		sparkReport.config().setDocumentTitle(projectName);
		sparkReport.config().setReportName("Automation Report");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setEncoding("utf-10");
		sparkReport.config().setProtocol(Protocol.HTTPS);
		sparkReport.config().setTimeStampFormat("yyyy-MM-dd HH:mm:ss");
		reports = new ExtentReports();
		reports.attachReporter(sparkReport);
		testInfo = reports.createTest(featureName);
	}

	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			stepInfo.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			stepInfo.pass(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			stepInfo.skip(result.getThrowable());
		}
	}

	private void updateReport(TestStatus status, String scenario, String step) {

		String[][] desc = { { "" }, { generateScreenshotData(step) } };
		switch (status) {
		case PASS:
			updatePass(scenario, desc);
			break;
		case FAIL:
			updateFail(scenario, desc);
			break;

		case SKIP:
			updateSkip(scenario, desc);
			break;

		case BLOCKED:
			updateBlocked(scenario, desc);
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + status);
		}

	}

	private String generateScreenshotData(String step) {
		return "<table>" + "<tbody>" + "<tr>" + "<td width='100%'><lable for=\"Expected Result\">" + step
				+ "</lable><br></td>" + "</tbody>" + "</table>";
	}

	public void updateResult(TestStatus status, String scenario, String step) {
		resultDetails(status, scenario, step);
	}

	private void resultDetails(TestStatus status, String scenario, String step) {
		updateReport(status, scenario, step);
	}

	private void updateBlocked(String scenario, String[][] desc) {
		stepInfo = testInfo.createNode(scenario);
		stepInfo.log(Status.WARNING, MarkupHelper.createTable(desc));
		scenarioTest = scenario;
	}

	private void updateSkip(String scenario, String[][] desc) {
		stepInfo = testInfo.createNode(scenario);
		stepInfo.log(Status.SKIP, MarkupHelper.createTable(desc));
		scenarioTest = scenario;
	}

	private void updateFail(String scenario, String[][] desc) {
		if (scenarioTest != null && scenarioTest.equals(scenario)) {

			stepInfo.log(Status.FAIL, MarkupHelper.createTable(desc));
			scenarioTest = scenario;
		} else {
			stepInfo = testInfo.createNode(scenario);
			stepInfo.log(Status.FAIL, MarkupHelper.createTable(desc));
			scenarioTest = scenario;
		}
	}

	private void updatePass(String scenario, String[][] desc) {
		if (scenarioTest != null && scenarioTest.equals(scenario)) {

			stepInfo.log(Status.PASS, MarkupHelper.createTable(desc));
			scenarioTest = scenario;
		} else {
			stepInfo = testInfo.createNode(scenario);
			stepInfo.log(Status.PASS, MarkupHelper.createTable(desc));
			scenarioTest = scenario;
		}

	}
}
