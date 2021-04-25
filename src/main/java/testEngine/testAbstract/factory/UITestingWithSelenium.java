package testEngine.testAbstract.factory;

import java.io.File;

import testEngine.environment.adapter.SetupDriveEnv;
import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.GlobalVariables;
import testUtility.reporting.ExtentReportManagerUI;

public class UITestingWithSelenium extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("UI testing with Selenium");
		SetupDriveEnv setupDriveEnv=new SetupDriveEnv();
		setupDriveEnv.intiBrowser(context.getTestSystem(), context.getTestBrowser());
		ExtentReportManagerUI myReportingManager = new ExtentReportManagerUI();
		myReportingManager.onStart(new File(pathDirOutput+context.getTestProject()+".html"), context.getTestProject(),
				context.getTestFeature());
	}

}
