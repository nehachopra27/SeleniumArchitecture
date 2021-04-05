package browserBridge;

import org.openqa.selenium.chrome.ChromeDriver;

import globalUtilities.GlobalVariables;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser extends GlobalVariables implements InitiateDriver {

	@Override
	public void remoteDriver() {
		// TODO Auto-generated method stub
		System.out.println("chrome driver execute");
		WebDriverManager.chromedriver().setup();
		_seleniumDriver = new ChromeDriver();

	}

}
