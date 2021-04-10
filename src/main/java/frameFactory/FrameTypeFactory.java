package frameFactory;

import globalUtilities.GlobalVariables.frameworkName;

public class FrameTypeFactory {

	public FrameType getFrameType(frameworkName frameName) {
		switch (frameName) {
		case TESTNG: {
			return new TestngFrame();
		}
		case CUCUMBER: {
			return new CucumberFrame();
		}
		default:
			return null;
		}

	}
}
