package frameVisitor;

public class SetupLogFile implements FrameworkHandler{

	public void frameAcceptance(FrameworkVisitor frameworkVisitor) {
		frameworkVisitor.setup(this);
	}

}
