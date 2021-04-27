package testengine.browser.bridge;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testinit.GlobalVariables;

public class IEBrowser extends GlobalVariables implements InitiateDriver{

	public void selniumRemoteDriver() {
		WebDriverManager.chromedriver().setup();
		seleniumDriver=new InternetExplorerDriver();
		seleniumDriver.close();
		log.info("IE Browser executed");

	}

}
