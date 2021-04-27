package testinit;

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

	public enum EnvironmentName {
		TEST, STAGE, PROD
	}

	public enum TestingTypes {
		UI, API, DATABASE
	}

	public enum TestingFrame {
		UI_TESTING_WITH_SELENIUM, UI_TESTING_WITH_PROTRACTOR, API_TESTING_WITH_REST_ASSURED, API_TESTING_WITH_KARATE
	}

	public enum SystemType {
		WINDOWS, MAC, ANDROID
	}

	public enum BrowserName {
		CHROME, IE, SAFARI
	}

	public enum FrameworkName {
		CUCUMBER, TESTNG, DATADRIVEN
	}

	public enum TestStatus {
		PASS, FAIL, SKIP, BLOCKED
	}

	public enum ElementType {
		BYID, BYCSSSELECTOR, BYXPATH, BYCLASSNAME, BYLINKTEXT, BYPARTIALLINKTEXT, BYJS
	}

	public static ExtentReports reports;
	public static ExtentTest testInfo;
	public static ExtentTest stepInfo;
	public static String scenarioTest;
	public  ExtentSparkReporter sparkReport;
	Map<String, ExtentTest> feature = new HashMap<String, ExtentTest>();
	public static String actualResult;
	public static String moduleName;

	public RequestSpecification request;
	public static final JSONObject requestParams = new JSONObject();
	public Response response;
	
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
