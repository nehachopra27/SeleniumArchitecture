package testEngine.testAbstract.factory;

import testInit.GlobalVariables._testingType;

public class TestingProducer {
	
	TestingProducer() {
		
	}
	public static TestingAbstractFactory gettestFactory(_testingType testingType) {
		switch (testingType) {
		case UI: {
			return new UITesting();
		}
		case API: {
			return new APITesting();
		}
		case DATABASE:{
			return null;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingType);
		}
	}
	
}
