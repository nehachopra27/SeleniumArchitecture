package testEngine.frame.factory;

import testEngine.frame.Interceptor.FrameworkUnmarshled;
import testInit.GlobalVariables;

public class DataDriver extends GlobalVariables implements FrameType{

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Data Driven Frame Executing");
	}

}
