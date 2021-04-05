package globalUtilities;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import net.lightbody.bmp.BrowserMobProxyServer;

public class GlobalVariables {
	public static String projectName;

	public static enum environmentName {
		TEST, STAGE, PROD
	}

	public static enum testingType {
		UI, API, DATABASE
	}

	public static enum systemType {
		WINDOWS, MAC, ANDROID
	}

	public static enum browserName {
		CHROME, IE, SAFARI
	}

	public static enum frameworkName {
		CUCUMBER, TESTNG, DATADRIVEN
	}

	public static String moduleName;

	public static Logger log;

	private static String path = "src/main/resources";

	private static File file = new File(path);
	public static String absolutePath = file.getAbsolutePath();

	public static String fileLog4j = absolutePath + System.getProperty("file.separator") + "log4j.properties";
	public static WebDriver driver;
    public static BrowserMobProxyServer proxy;
}
