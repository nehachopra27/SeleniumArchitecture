package testengine.frame.factory;

import testinit.GlobalVariables.FrameworkName;

public class FrameTypeFactory {

	public FrameType getFrameType(FrameworkName frameName) {
		switch (frameName) {
		case TESTNG:
			return new TestngFrame();
		case CUCUMBER:
			return new CucumberFrame();
		case DATADRIVEN:
			return new DataDriver();
		default:
			return null;
		}
	}

}
