package frame_factory;

import frameworkInterceptor.FrameworkUnmarshled;
import util.GlobalVariables;

public class DataDriver extends GlobalVariables implements FrameType{

	public void selectFrameType(FrameworkUnmarshled context) {
		log.info("Data Driven Frame Executing");
	}

}
