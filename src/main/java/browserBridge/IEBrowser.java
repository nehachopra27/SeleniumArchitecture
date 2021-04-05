package browserBridge;

import org.openqa.selenium.ie.InternetExplorerDriver;

import globalUtilities.GlobalVariables;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IEBrowser extends GlobalVariables implements InitiateDriver{


	@Override
	public void remoteDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
		_seleniumDriver = new InternetExplorerDriver();

	}

}
