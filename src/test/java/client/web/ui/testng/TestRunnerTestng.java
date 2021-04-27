package client.web.ui.testng;

import java.io.IOException;

import testengine.frame.interceptor.FrameworkImplementation;
import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.TestDriver;
import testinit.GlobalVariables.BrowserName;
import testinit.GlobalVariables.EnvironmentName;
import testinit.GlobalVariables.FrameworkName;
import testinit.GlobalVariables.SystemType;
import testinit.GlobalVariables.TestingFrame;
import testinit.GlobalVariables.TestingTypes;

public class TestRunnerTestng {

	public static void main(String[] args) throws IOException {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(BrowserName.CHROME);
		unmarshled.setTestEnvironment(EnvironmentName.STAGE);
		unmarshled.setTestFeature("loginTestngUI.xml");
		unmarshled.setTestProject("TestngProject");
		unmarshled.setTestSystem(SystemType.MAC);
		unmarshled.setTestType(TestingTypes.UI);
		unmarshled.setTestTypeFrame(TestingFrame.UI_TESTING_WITH_SELENIUM);
		unmarshled.setFrameworkName(FrameworkName.TESTNG);
		myTestDriver.testInitiator(unmarshled);

	}
}
