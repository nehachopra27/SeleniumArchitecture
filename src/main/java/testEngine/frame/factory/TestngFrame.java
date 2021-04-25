package testEngine.frame.factory;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testEngine.testAbstract.factory.TestingAbstractFactory;
import testEngine.testAbstract.factory.TestingProducer;
import testEngine.testAbstract.factory.TestingType;
import testInit.GlobalVariables;

public class TestngFrame extends GlobalVariables implements FrameType{

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Testng Frame Executing");
		TestingAbstractFactory testFactory=TestingProducer.gettestFactory(context.getTestType());
		TestingType testType=testFactory.getTestingType(context.getTestTypeFrame());
		testType.testing(context);
		String testngFile=dirTestResource+context.getTestFeature();
		TestNG runner=new TestNG();
		List<String> suitefiles=new ArrayList<String>();
		suitefiles.add(testngFile);
		runner.setTestSuites(suitefiles);
		runner.run();
	}
}
