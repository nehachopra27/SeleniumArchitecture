package client.web.ui.cucumber;

import java.io.IOException;

import testengine.frame.interceptor.FrameworkImplementation;
import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.TestDriver;
import testinit.GlobalVariables.*;

public class TestRunner {
	public static void main(String[] args) throws IOException {
		TestDriver myTestDriver = new TestDriver();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(BrowserName.CHROME);
		unmarshled.setTestEnvironment(EnvironmentName.STAGE);
		unmarshled.setTestFeature("loginCucumberUI.feature");
		unmarshled.setTestProject("cucumberProject");
		unmarshled.setTestSystem(SystemType.MAC);
		unmarshled.setTestType(TestingTypes.UI);
		unmarshled.setTestTypeFrame(TestingFrame.UI_TESTING_WITH_SELENIUM);
		unmarshled.setFrameworkName(FrameworkName.CUCUMBER);
		myTestDriver.testInitiator(unmarshled);
	}

}
