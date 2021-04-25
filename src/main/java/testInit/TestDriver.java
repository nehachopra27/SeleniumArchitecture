package testInit;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import testEngine.frame.Interceptor.FrameDispatcher;
import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testEngine.frame.Interceptor.TestFrameRequestInterceptor;
import testEngine.frame.factory.FrameType;
import testEngine.frame.factory.FrameTypeFactory;
import testEngine.frame.visitor.Frame;
import testEngine.frame.visitor.FrameSetupVisitorImp;

public class TestDriver extends GlobalVariables {
	
	public void testInitiator(FrameworkUnmarshled context) {
		TestFrameRequestInterceptor myFrameInterceptor = new TestFrameRequestInterceptor() {

			public void onPreInit() {
				Frame frame = new Frame();
				frame.frameAcceptance(new FrameSetupVisitorImp());
			}

			public void intiateLogs() {

				log = Logger.getLogger(Frame.class);
				PropertyConfigurator.configure(pathLog4jProperties);
				log.info("message");
			}

			public void intiateFrame(FrameworkUnmarshled context) {
				log.info("Initiate FrameType");
				FrameTypeFactory myFrameFactory = new FrameTypeFactory();
				FrameType myFrameType = myFrameFactory.getFrameType(context.getFrameworkName());
				myFrameType.selectFrameType(context);
			}

			public void onPostFrameworkRequest(FrameworkUnmarshled context) {
				switch (context.getTestType()) {
				case UI: {
					reports.flush();
					seleniumDriver.close();
					break;
				}
				case API: {
					reports.flush();
					break;
				}
				case DATABASE: {
					break;
				}
				default:
					break;
				}

				log.info("Execution Complete");
			}

		};

		FrameDispatcher.getInstance().registerFrameRequestInterceptor(myFrameInterceptor);
		FrameDispatcher.getInstance().dispatchFrameworkRequestInterceptor(context);
		FrameDispatcher.getInstance().removeFrameRequestInterceptor(myFrameInterceptor);

	}

}
