package testEngine.frame.factory;

import testInit.GlobalVariables._frameworkName;

public class FrameTypeFactory {

	public FrameType getFrameType(_frameworkName frameName) {
		switch (frameName) {
		case TESTNG: {
			return new TestngFrame();
		}
		case CUCUMBER: {
			return new CucumberFrame();
		}
		case DATADRIVEN:{
			return new DataDriver();
		}
		default:
			return null;
		}
	}
	
}
