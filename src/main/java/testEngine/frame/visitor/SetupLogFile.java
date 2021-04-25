package testEngine.frame.visitor;

public class SetupLogFile implements FrameworkHandler{

	public void frameAcceptance(FrameworkVisitor frameworkVisitor) {
		frameworkVisitor.setup(this);
	}

}
