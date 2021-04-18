package frame_factory;

import frameworkInterceptor.FrameworkUnmarshled;
import test_abstract_factory.*;
import util.GlobalVariables;

public class TestngFrame extends GlobalVariables implements FrameType{

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Testng Frame Executing");
		TestingAbstractFactory testFactory=TestingProducer.gettestFactory(context.getTestType());
		TestingType testType=testFactory.getTestingType(context.getTestTypeFrame());
		testType.testing(context);
	}
}
