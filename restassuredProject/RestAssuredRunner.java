package client.rest.restassured;

import testEngine.frame.Interceptor.FrameworkImplementation;
import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.TestDriver;
import testInit.GlobalVariables._environmentName;
import testInit.GlobalVariables._frameworkName;
import testInit.GlobalVariables._testingFrame;
import testInit.GlobalVariables._testingType;

public class RestAssuredRunner {
	public static void main(String[] args) {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		
		unmarshled.setTestEnvironment(_environmentName.STAGE);
		unmarshled.setTestFeature("loginCucumberAPI.feature");
		unmarshled.setTestProject("APIProject");
		unmarshled.setTestType(_testingType.API);
		unmarshled.setTestTypeFrame(_testingFrame.API_TESTING_WITH_REST_ASSURED);
		unmarshled.setFrameworkName(_frameworkName.CUCUMBER);
		myTestDriver.testInitiator(unmarshled);

	}
}
