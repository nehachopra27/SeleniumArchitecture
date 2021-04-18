package frame_factory;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import frameworkInterceptor.FrameworkUnmarshled;
import test_abstract_factory.*;
import util.GlobalVariables;

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
