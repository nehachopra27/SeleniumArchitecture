package testAbstractFactory;

import globalUtilities.GlobalVariables.testingType;

public class TestingProducer {
	public static TestingAbstractFactory gettestFactory(testingType testingType) {
		switch (testingType) {
		case UI: {
			return new UITesting();
		}
		case API: {
			return new APITesting();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingType);
		}

	}
}
