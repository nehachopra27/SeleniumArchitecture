package testEngine.testAbstract.factory;

import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.GlobalVariables;

public class UITestingWithProtractor extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("UI testing with protractor");
	}

}
