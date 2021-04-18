package sample;

import frameworkInterceptor.FrameworkImplementation;
import frameworkInterceptor.FrameworkUnmarshled;
import testInititor.TestDriver;
import util.GlobalVariables.*;

public class TestRunner {

	public static void main(String[] args) {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(_browserName.CHROME);
		unmarshled.setTestEnvironment(_environmentName.STAGE);
		unmarshled.setTestFeature("login.feature");
		unmarshled.setTestProject("ProjectA");
		unmarshled.setTestSystem(_systemType.WINDOWS);
		unmarshled.setTestType(_testingType.UI);
		unmarshled.setTestTypeFrame(_testingFrame.UI_TESTING_WITH_SELENIUM);
		unmarshled.setFrameworkName(_frameworkName.CUCUMBER);
		myTestDriver.testInitiator(unmarshled);
	}

}
