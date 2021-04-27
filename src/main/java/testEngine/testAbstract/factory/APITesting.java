package testengine.testabstract.factory;

import testinit.GlobalVariables.TestingFrame;

public class APITesting extends TestingAbstractFactory {

	@Override
	public TestingType getTestingType(TestingFrame testingFrame) {
		TestingType myTestingType;
		switch (testingFrame) {
		case API_TESTING_WITH_REST_ASSURED:
			myTestingType = new APITestingWithRestAssured();
			break;
		case API_TESTING_WITH_KARATE:
			myTestingType = new APITestingWithKarate();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingFrame);
		}
		return myTestingType;

	}

}
