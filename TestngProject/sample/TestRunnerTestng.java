package sample;

import frameworkInterceptor.FrameworkImplementation;
import frameworkInterceptor.FrameworkUnmarshled;
import testInititor.TestDriver;
import util.GlobalVariables._browserName;
import util.GlobalVariables._environmentName;
import util.GlobalVariables._frameworkName;
import util.GlobalVariables._systemType;
import util.GlobalVariables._testingFrame;
import util.GlobalVariables._testingType;

public class TestRunnerTestng {

	public static void main(String[] args) {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(_browserName.CHROME);
		unmarshled.setTestEnvironment(_environmentName.STAGE);
		unmarshled.setTestFeature("login.xml");
		unmarshled.setTestProject("TestngProject");
		unmarshled.setTestSystem(_systemType.WINDOWS);
		unmarshled.setTestType(_testingType.UI);
		unmarshled.setTestTypeFrame(_testingFrame.UI_TESTING_WITH_SELENIUM);
		unmarshled.setFrameworkName(_frameworkName.TESTNG);
		myTestDriver.testInitiator(unmarshled);

	}

}
