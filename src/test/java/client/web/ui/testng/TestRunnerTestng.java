package client.web.ui.testng;

import testEngine.frame.Interceptor.FrameworkImplementation;
import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.TestDriver;
import testInit.GlobalVariables._browserName;
import testInit.GlobalVariables._environmentName;
import testInit.GlobalVariables._frameworkName;
import testInit.GlobalVariables._systemType;
import testInit.GlobalVariables._testingFrame;
import testInit.GlobalVariables._testingType;

public class TestRunnerTestng {

	public static void main(String[] args) {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(_browserName.CHROME);
		unmarshled.setTestEnvironment(_environmentName.STAGE);
		unmarshled.setTestFeature("loginTestngUI.xml");
		unmarshled.setTestProject("TestngProject");
		unmarshled.setTestSystem(_systemType.WINDOWS);
		unmarshled.setTestType(_testingType.UI);
		unmarshled.setTestTypeFrame(_testingFrame.UI_TESTING_WITH_SELENIUM);
		unmarshled.setFrameworkName(_frameworkName.TESTNG);
		myTestDriver.testInitiator(unmarshled);

	}
}
