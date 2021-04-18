package test_abstract_factory;

import frameworkInterceptor.FrameworkUnmarshled;
import util.GlobalVariables;

public class UITestingWithProtractor extends GlobalVariables implements TestingType{

	public void testing(FrameworkUnmarshled context) {
		log.info("UI testing with protractor");
	}

}
