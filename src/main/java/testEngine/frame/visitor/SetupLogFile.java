package testengine.frame.visitor;

import java.io.IOException;

public class SetupLogFile implements FrameworkHandler{

	public void frameAcceptance(FrameworkVisitor frameworkVisitor) throws IOException {
		frameworkVisitor.setup(this);
	}

}
