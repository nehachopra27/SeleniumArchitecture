package testEngine.testAbstract.factory;

import testInit.GlobalVariables._testingFrame;

public class UITesting extends TestingAbstractFactory{

	@Override
	public TestingType getTestingType(_testingFrame testingFrame) {
		
		TestingType myTestingType;
		switch (testingFrame) {
		case UI_TESTING_WITH_SELENIUM: {
			myTestingType= new UITestingWithSelenium();
			break;
		}
		case UI_TESTING_WITH_PROTRACTOR: {
			myTestingType= new UITestingWithProtractor();
			break;
		}
		default:
			throw  new IllegalArgumentException("Unexpected value: " + testingFrame);
		}
		return myTestingType;
	}

}
