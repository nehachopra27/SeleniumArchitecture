package testengine.frame.factory;

import testengine.frame.interceptor.FrameworkUnmarshled;
import testinit.GlobalVariables;

public class DataDriver extends GlobalVariables implements FrameType{

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Data Driven Frame Executing");
	}

}
