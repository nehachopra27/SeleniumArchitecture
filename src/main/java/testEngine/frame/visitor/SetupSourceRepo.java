package testEngine.frame.visitor;

public class SetupSourceRepo implements FrameworkHandler{

	public void frameAcceptance(FrameworkVisitor frameworkVisitor) {
		frameworkVisitor.setup(this);
	}

}
