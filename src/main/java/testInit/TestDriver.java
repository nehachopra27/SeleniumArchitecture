package testinit;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import testengine.frame.interceptor.FrameDispatcher;
import testengine.frame.interceptor.FrameworkUnmarshled;
import testengine.frame.interceptor.TestFrameRequestInterceptor;
import testengine.frame.factory.FrameType;
import testengine.frame.factory.FrameTypeFactory;
import testengine.frame.visitor.Frame;
import testengine.frame.visitor.FrameSetupVisitorImp;

public class TestDriver extends GlobalVariables {
	
	public void testInitiator(FrameworkUnmarshled context) throws IOException {
		TestFrameRequestInterceptor myFrameInterceptor = new TestFrameRequestInterceptor() {

			public void onPreInit() throws IOException {
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
				reports.flush();
				switch (context.getTestType()) {
				case UI: 
					seleniumDriver.close();
					break;
				case API: 
					reports.flush();
					break;
				case DATABASE: 
					break;
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
