package testAbstractFactory;

import globalUtilities.GlobalVariables.testingFrame;

public class APITesting extends TestingAbstractFactory {

	@Override
	public TestingType getTestingType(testingFrame testingFrame) {
		// TODO Auto-generated method stub
		switch (testingFrame) {
		case APITestingWithRestAssured: {
			return new APITestingWithRestAssured();
		}
		case APITestingWithKarate: {
			return new APITestingWithKarate();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + testingFrame);
		}
	}

}
