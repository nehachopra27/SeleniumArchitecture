package testengine.frame.visitor;

import java.io.IOException;

public interface FrameworkHandler {
	public void frameAcceptance(FrameworkVisitor frameworkVisitor) throws IOException;
}
