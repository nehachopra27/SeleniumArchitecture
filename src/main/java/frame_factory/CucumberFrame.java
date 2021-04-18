package frame_factory;

import frameworkInterceptor.FrameworkUnmarshled;
import io.cucumber.core.cli.Main;
import test_abstract_factory.*;
import util.GlobalVariables;

public class CucumberFrame extends GlobalVariables implements FrameType {

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Cucumber Frame Executing");
		TestingAbstractFactory testFactory = TestingProducer.gettestFactory(context.getTestType());
		TestingType testType = testFactory.getTestingType(context.getTestTypeFrame());
		testType.testing(context);
		String featureFile=dirTestResource+context.getTestFeature();
		String[] argv=featureFile.split(" ");
		ClassLoader contectClassLoader=Thread.currentThread().getContextClassLoader();
		Main.run(argv,contectClassLoader);
		
	}

}
