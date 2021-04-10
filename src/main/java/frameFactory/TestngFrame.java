package frameFactory;

import frameworkInterceptor.FrameworkUnmarshled;
import testAbstractFactory.*;

public class TestngFrame implements FrameType{

	@Override
	public void selectFrameType(FrameworkUnmarshled context) {
		// TODO Auto-generated method stub
		System.out.println("testng");
		TestingAbstractFactory testFactory=TestingProducer.gettestFactory(context.getTestType());
		TestingType testType=testFactory.getTestingType(context.getTestTypeFrame());
		testType.testing(context);
	}
}
