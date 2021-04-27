package client.rest.restassured;

import java.io.IOException;

import org.testng.annotations.Test;

import testengine.frame.interceptor.FrameworkImplementation;
import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.TestDriver;
import testinit.GlobalVariables.EnvironmentName;
import testinit.GlobalVariables.FrameworkName;
import testinit.GlobalVariables.TestingFrame;
import testinit.GlobalVariables.TestingTypes;

public class RestAssuredRunner {
	
	@Test
	public void runner() throws IOException {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		
		unmarshled.setTestEnvironment(EnvironmentName.STAGE);
		unmarshled.setTestFeature("loginCucumberAPI.feature");
		unmarshled.setTestProject("APIProject");
		unmarshled.setTestType(TestingTypes.API);
		unmarshled.setTestTypeFrame(TestingFrame.API_TESTING_WITH_REST_ASSURED);
		unmarshled.setFrameworkName(FrameworkName.CUCUMBER);
		myTestDriver.testInitiator(unmarshled);

	}
}
