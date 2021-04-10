package testAbstractFactory;

import globalUtilities.GlobalVariables.testingFrame;

public class UITesting extends TestingAbstractFactory{

	@Override
	public TestingType getTestingType(testingFrame testingFrame) {
		// TODO Auto-generated method stub
		switch (testingFrame) {
		case UITestingWithSelenium: {
			return new UITestingWithSelenium();
		}
		case UITestingWithProtractor: {
			return new UITestingWithProtractor();
		}
		default:
			throw  new IllegalArgumentException("Unexpected value: " + testingFrame);
		}
	}

}
