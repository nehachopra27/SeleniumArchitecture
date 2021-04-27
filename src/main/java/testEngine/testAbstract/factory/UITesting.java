package testengine.testabstract.factory;

import testinit.GlobalVariables.TestingFrame;

public class UITesting extends TestingAbstractFactory {

	@Override
	public TestingType getTestingType(TestingFrame testingFrame) {

		TestingType myTestingType;
		switch (testingFrame) {
		case UI_TESTING_WITH_SELENIUM:
			myTestingType = new UITestingWithSelenium();
			break;
		case UI_TESTING_WITH_PROTRACTOR:
			myTestingType = new UITestingWithProtractor();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingFrame);
		}
		return myTestingType;
	}

}
