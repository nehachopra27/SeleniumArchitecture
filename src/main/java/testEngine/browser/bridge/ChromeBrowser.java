package testengine.browser.bridge;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testinit.GlobalVariables;

public class ChromeBrowser extends GlobalVariables implements InitiateDriver {

	public void selniumRemoteDriver() {
		WebDriverManager.chromedriver().setup();
		seleniumDriver = new ChromeDriver();
		seleniumDriver.manage().window().maximize();
		seleniumDriver.manage().deleteAllCookies();
		log.info("chrome Browser Initiated");
	}

}
