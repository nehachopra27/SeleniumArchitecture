package testInit;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class GlobalVariables {

	public enum _environmentName {
		TEST, STAGE, PROD
	}

	public enum _testingType {
		UI, API, DATABASE
	}

	public enum _testingFrame {
		UI_TESTING_WITH_SELENIUM, UI_TESTING_WITH_PROTRACTOR, API_TESTING_WITH_REST_ASSURED, API_TESTING_WITH_KARATE
	}

	public enum _systemType {
		WINDOWS, MAC, ANDROID
	}

	public enum _browserName {
		CHROME, IE, SAFARI
	}

	public enum _frameworkName {
		CUCUMBER, TESTNG, DATADRIVEN
	}

	public enum _status {
		PASS, FAIL, SKIP, BLOCKED
	}

	public enum _elementType {
		ByID, ByCssSelector, ByXpath, ByClassName, ByLinkText, ByPartialLinkText, Byjs
	}

	public static ExtentReports reports;
	public static ExtentTest testInfo;
	public static ExtentTest stepInfo;
	public static String _scenario;
	public static ExtentSparkReporter sparkReport;
	Map<String, ExtentTest> feature = new HashMap<String, ExtentTest>();
	public static String _actualResult;
	static String moduleName;

	public static RequestSpecification _request;
	public static JSONObject requestParams = new JSONObject();
	public static Response _response;
	
	public static Logger log;
	public static final String seprator = System.getProperty("file.separator");
	private static final String dirPath = System.getProperty("user.dir");
	public static final String dirTestResource = dirPath + seprator + "src" + seprator + "test" + seprator + "resources"
			+ seprator;
	public static final String pathDirResource = dirPath + seprator + "frameResource" + seprator;
	public static final String pathDirOutput = dirPath + seprator + "frameOutput" + seprator;
	public static final String pathLog4jProperties = pathDirResource + "log4j.properties";
	public static final String pathFileLog4jReportHTML = pathDirOutput + "logsHTML.html";
	public static WebDriver seleniumDriver;
	public static final String _pathScreenshot = pathDirOutput + "screenshot"+seprator;
}
