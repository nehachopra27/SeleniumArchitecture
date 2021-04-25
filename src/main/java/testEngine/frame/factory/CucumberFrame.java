package testEngine.frame.factory;

import io.cucumber.core.cli.Main;
import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testEngine.testAbstract.factory.TestingAbstractFactory;
import testEngine.testAbstract.factory.TestingProducer;
import testEngine.testAbstract.factory.TestingType;
import testInit.GlobalVariables;

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
