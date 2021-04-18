package reporting;

import java.io.File;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

import screenshot.ScreenshotManager;
import screenshot.ScreenshotManagerImp;
import util.GlobalVariables;

public class ExtentReportManagerImp extends GlobalVariables implements ExtentReportManager {

	public void onStart(File extentReportPath, String projectName,String featureName) {
		sparkReport = new ExtentSparkReporter(extentReportPath);
		sparkReport.config().setDocumentTitle(projectName);
		sparkReport.config().setReportName("Automation Report");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setEncoding("utf-10");
		sparkReport.config().setProtocol(Protocol.HTTPS);
		sparkReport.config().setTimeStampFormat("yyyy-MM-dd HH:mm:ss");
		reports = new ExtentReports();
		reports.attachReporter(sparkReport);
	}

	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			testInfo.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			testInfo.pass(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			testInfo.skip(result.getThrowable());
		}
	}

	public void updateReport(_status status, String expectedResult, String actualResult, String pathScreenshot) {
		String url = "<img width='100px' src=\"" + pathScreenshot + "\"data-src=\"" + pathScreenshot
				+ "\" data-featherlight=\"" + pathScreenshot + "\">";
		String[][] desc = { { "" }, { generateScreenshotData(expectedResult, actualResult, url) } };
		switch (status) {
		case PASS: {
			testInfo.log(Status.PASS, MarkupHelper.createTable(desc));
			break;
		}
		case FAIL: {
			testInfo.log(Status.FAIL, MarkupHelper.createTable(desc));
			break;
		}
		case SKIP: {
			testInfo.log(Status.SKIP, MarkupHelper.createTable(desc));
			break;
		}
		case BLOCKED: {
			testInfo.log(Status.WARNING, MarkupHelper.createTable(desc));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + status);
		}
	}

	private String generateScreenshotData(String expectedResult, String actualResult, String screenshot) {
		return "<table>" + "<tbody>" + "<tr>" + "<td width='35%'><lable for=\"Expected Result\">" + expectedResult
				+ "</lable><br></td>" + "<td width='60%'><lable for=\"Actual Result\">" + actualResult
				+ "</lable><br></td>" + "<td width='5%'>" + screenshot + "</td>" + "</tr>" + "</tbody>" + "</table>";
	}

	public void flushReport() {
		reports.flush();
	}

	public void updateResult(_status status, String passText, String failText, String expectedResult,
			String screenshot) {
		if (status == _status.PASS) {
			_actualResult = passText;
		} else {
			_actualResult = failText;
		}
		resultDetails(status, expectedResult, screenshot);
	}

	public void resultDetails(_status status, String expectedResult, String pathScreenshot) {
		ScreenshotManager objScreenshotManager=new ScreenshotManagerImp();
		objScreenshotManager.takeScreenshot(pathScreenshot, expectedResult);
		updateReport(status, expectedResult, _actualResult, pathScreenshot + expectedResult + ".png");
	}

}
