package testInititor;

import java.awt.Frame;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import frameworkInterceptor.FrameDispatcher;
import frameworkInterceptor.FrameworkUnmarshled;
import frameworkInterceptor.TestFrameRequestInterceptor;
import globalUtilities.GlobalVariables;
import globalUtilities.GlobalVariables.frameworkName;
import testFactory.TestType;
import testFactory.TestTypeFactory;

public class TestDriver {

	public void testInitiator(FrameworkUnmarshled context, frameworkName frame) {
		TestFrameRequestInterceptor myFrameInterceptor = new TestFrameRequestInterceptor() {

			@Override
			public void intiateLogs() {
				// TODO Auto-generated method stub
				GlobalVariables.log = Logger.getLogger(Frame.class);
				PropertyConfigurator.configure(GlobalVariables.fileLog4j);
				GlobalVariables.log.info("message");
			}

			@Override
			public void intiateReports() {
				// TODO Auto-generated method stub

			}

			@Override
			public void intiateFrameRequest(FrameworkUnmarshled context) {
				// TODO Auto-generated method stub
				TestTypeFactory myTestFactory = new TestTypeFactory();
				TestType myTestType = myTestFactory.getTestingType(context.getTestType());
				myTestType.selectTestingType(context);
			}

			@Override
			public void onPostFrameworkRequest() {
				// TODO Auto-generated method stub
				System.out.println("post");
			}

		};

		FrameDispatcher.getInstance().registerFrameRequestInterceptor(myFrameInterceptor);
		FrameDispatcher.getInstance().dispatchFrameworkRequestInterceptor(context);
		FrameDispatcher.getInstance().removeFrameRequestInterceptor(myFrameInterceptor);

	}

}
