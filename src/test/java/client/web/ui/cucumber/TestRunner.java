package client.web.ui.cucumber;

import testEngine.frame.Interceptor.FrameworkImplementation;
import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.TestDriver;
import testInit.GlobalVariables.*;

public class TestRunner {
	public static void main(String[] args) {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(_browserName.CHROME);
		unmarshled.setTestEnvironment(_environmentName.STAGE);
		unmarshled.setTestFeature("loginCucumberUI.feature");
		unmarshled.setTestProject("cucumberProject");
		unmarshled.setTestSystem(_systemType.WINDOWS);
		unmarshled.setTestType(_testingType.UI);
		unmarshled.setTestTypeFrame(_testingFrame.UI_TESTING_WITH_SELENIUM);
		unmarshled.setFrameworkName(_frameworkName.CUCUMBER);
		myTestDriver.testInitiator(unmarshled);
	}

}
