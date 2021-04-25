package testEngine.testAbstract.factory;

import java.io.File;

import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.GlobalVariables;
import testUtility.reporting.ExtentReportManager;
import testUtility.reporting.ExtentReportManagerAPI;

public class APITestingWithRestAssured extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("API testing with restAssured cucumber");
		ExtentReportManager myReportingManager = new ExtentReportManagerAPI();
		myReportingManager.onStart(new File(pathDirOutput+context.getTestProject()+".html"), context.getTestProject(),
				context.getTestFeature());
	}

}
