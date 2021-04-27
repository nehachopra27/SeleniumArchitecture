package testengine.frame.factory;

import io.cucumber.core.cli.Main;
import testengine.frame.interceptor.FrameworkUnmarshled;
import testengine.testabstract.factory.TestingAbstractFactory;
import testengine.testabstract.factory.TestingProducer;
import testengine.testabstract.factory.TestingType;
import testinit.GlobalVariables;

public class CucumberFrame extends GlobalVariables implements FrameType {

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Cucumber Frame Executing");
		TestingAbstractFactory testFactory = TestingProducer.getTestFactory(context.getTestType());
		TestingType testType = testFactory.getTestingType(context.getTestTypeFrame());
		testType.testing(context);
		String featureFile=dirTestResource+context.getTestFeature();
		String[] argv=featureFile.split(" ");
		ClassLoader contectClassLoader=Thread.currentThread().getContextClassLoader();
		Main.run(argv,contectClassLoader);
		
	}

}
