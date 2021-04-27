package testengine.testabstract.factory;

import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.GlobalVariables;

public class UITestingWithProtractor extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("UI testing with protractor");
	}

}
