package testAbstractFactory;

import environmentAdapter.SetupDriveEnv;
import frameworkInterceptor.FrameworkUnmarshled;

public class UITestingWithSelenium implements TestingType{

	@Override
	public void testing(FrameworkUnmarshled context) {
		// TODO Auto-generated method stub
		System.out.println("UI with Selenium");
		SetupDriveEnv setupDriveEnv=new SetupDriveEnv();
		setupDriveEnv.intiBrowser(context.getTestSystem(), context.getTestBrowser());
	}

}
