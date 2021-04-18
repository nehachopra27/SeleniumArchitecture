package test_abstract_factory;

import environmentAdapter.SetupDriveEnv;
import frameworkInterceptor.FrameworkUnmarshled;
import util.GlobalVariables;

public class UITestingWithSelenium extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("UI testing with Selenium");
		SetupDriveEnv setupDriveEnv=new SetupDriveEnv();
		setupDriveEnv.intiBrowser(context.getTestSystem(), context.getTestBrowser());
		
	}

}
