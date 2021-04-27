package testengine.testabstract.factory;

import testinit.GlobalVariables.TestingTypes;

public class TestingProducer {
	
	TestingProducer() {
		
	}
	public static TestingAbstractFactory getTestFactory(TestingTypes testingType) {
		switch (testingType) {
		case UI: 
			return new UITesting();
		case API: 
			return new APITesting();
		case DATABASE:
			return null;
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingType);
		}
	}
	
}
