package browser_bridge;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.GlobalVariables;

public class ChromeBrowser extends GlobalVariables implements InitiateDriver {

	public void selniumRemoteDriver() {
		WebDriverManager.chromedriver().setup();
		seleniumDriver = new ChromeDriver();
		seleniumDriver.manage().window().maximize();
		seleniumDriver.manage().deleteAllCookies();
		log.info("chrome Browser Initiated");
	}

}
