package frameFactory;

import frameworkInterceptor.FrameworkUnmarshled;
import testAbstractFactory.*;

public class CucumberFrame implements FrameType{

	@Override
	public void selectFrameType(FrameworkUnmarshled context) {
		// TODO Auto-generated method stub
		System.out.println("cucumber");
		TestingAbstractFactory testFactory=TestingProducer.gettestFactory(context.getTestType());
		TestingType testType=testFactory.getTestingType(context.getTestTypeFrame());
		testType.testing(context);
	}

}
