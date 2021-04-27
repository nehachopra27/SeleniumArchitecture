package testengine.testabstract.factory;

import java.io.File;

import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.GlobalVariables;
import testutility.reporting.ExtentReportManager;
import testutility.reporting.ExtentReportManagerAPI;

public class APITestingWithRestAssured extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("API testing with restAssured cucumber");
		ExtentReportManager myReportingManager = new ExtentReportManagerAPI();
		myReportingManager.onStart(new File(pathDirOutput+context.getTestProject()+".html"), context.getTestProject(),
				context.getTestFeature());
	}

}
