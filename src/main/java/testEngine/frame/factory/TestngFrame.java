package testengine.frame.factory;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import testengine.frame.interceptor.FrameworkUnmarshled;
import testengine.testabstract.factory.TestingAbstractFactory;
import testengine.testabstract.factory.TestingProducer;
import testengine.testabstract.factory.TestingType;
import testinit.GlobalVariables;

public class TestngFrame extends GlobalVariables implements FrameType{

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Testng Frame Executing");
		TestingAbstractFactory testFactory=TestingProducer.getTestFactory(context.getTestType());
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
