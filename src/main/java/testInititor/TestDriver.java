package testInititor;

import java.awt.Frame;
import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import frameVisitor.FrameSetupVisitorImp;
import frame_factory.*;
import frameworkInterceptor.*;
import reporting.ExtentReportManagerImp;
import util.GlobalVariables;

public class TestDriver extends GlobalVariables {

	public void testInitiator(FrameworkUnmarshled context) {
		TestFrameRequestInterceptor myFrameInterceptor = new TestFrameRequestInterceptor() {
			ExtentReportManagerImp myReportingManager = new ExtentReportManagerImp();

			public void onPreInit() {
				frameVisitor.Frame frame = new frameVisitor.Frame();
				frame.frameAcceptance(new FrameSetupVisitorImp());
			}

			public void intiateLogs() {

				log = Logger.getLogger(Frame.class);
				PropertyConfigurator.configure(pathLog4jProperties);
				log.info("message");
			}

			public void intiateReports(FrameworkUnmarshled context) {

				myReportingManager.onStart(new File(pathFileExtentReportHTML), context.getTestProject(),
						context.getTestFeature());
			}

			public void intiateFrame(FrameworkUnmarshled context) {
				log.info("Initiate FrameType");
				FrameTypeFactory myFrameFactory = new FrameTypeFactory();
				FrameType myFrameType = myFrameFactory.getFrameType(context.getFrameworkName());
				myFrameType.selectFrameType(context);
			}

			public void onPostFrameworkRequest() {
				myReportingManager.flushReport();
				seleniumDriver.close();
				log.info("Execution Complete");
			}

		};

		FrameDispatcher.getInstance().registerFrameRequestInterceptor(myFrameInterceptor);
		FrameDispatcher.getInstance().dispatchFrameworkRequestInterceptor(context);
		FrameDispatcher.getInstance().removeFrameRequestInterceptor(myFrameInterceptor);

	}

}
