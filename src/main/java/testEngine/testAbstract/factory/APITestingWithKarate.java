package testengine.testabstract.factory;

import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.GlobalVariables;

public class APITestingWithKarate extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("API testing with Karate");
	}

}
