package testengine.browser.bridge;

import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import testinit.GlobalVariables;

public class SafariBrowser extends GlobalVariables implements InitiateDriver{
	public void selniumRemoteDriver() {
		WebDriverManager.chromedriver().setup();
		seleniumDriver=new SafariDriver();

		log.info("safari Browser executed");
	}

}
