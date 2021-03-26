package testRunner;

import InitiateTesting.TestExecuter;
import implementation.FrameworkImplementation;
import unmarshaledRequest.FrameworkUnmarshled;
import InitiateTesting.GlobalValueSet.browserName;
import InitiateTesting.GlobalValueSet.environmentName;
import InitiateTesting.GlobalValueSet.frameworkName;
import InitiateTesting.GlobalValueSet.systemType;
import InitiateTesting.GlobalValueSet.testingType;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExecuter obj = new TestExecuter();

		FrameworkUnmarshled unmarshled = new FrameworkImplementation();
		unmarshled.setTestBrowser(browserName.CHROME.name());
		unmarshled.setTestEnvironment(environmentName.STAGE.name());
		unmarshled.setTestFeature("feature");
		unmarshled.setTestProject("ProjectA");
		unmarshled.setTestSystem(systemType.WINDOWS.name());
		unmarshled.setTestType(testingType.UI.name());
		obj.testInitiator(unmarshled, frameworkName.CUCUMBER);
	}

}
