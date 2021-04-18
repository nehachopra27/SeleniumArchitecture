package test_abstract_factory;

import util.GlobalVariables._testingFrame;

public class APITesting extends TestingAbstractFactory {

	@Override
	public TestingType getTestingType(_testingFrame testingFrame) {
		TestingType myTestingType;
		switch (testingFrame) {
		case API_TESTING_WITH_REST_ASSURED: {
			myTestingType= new APITestingWithRestAssured();
			break;
		}
		case API_TESTING_WITH_KARATE: {
			myTestingType= new APITestingWithKarate();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingFrame);
		}
		return myTestingType;
		
	}

}
