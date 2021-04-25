package testEngine.testAbstract.factory;

import testEngine.frame.Interceptor.FrameworkUnmarshled;

public class APITestingWithKarate implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		System.out.println("API testing with Karate");
	}

}
