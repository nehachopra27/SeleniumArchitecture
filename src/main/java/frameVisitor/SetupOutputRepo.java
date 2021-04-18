package frameVisitor;

public class SetupOutputRepo implements FrameworkHandler{

	public void frameAcceptance(FrameworkVisitor frameworkVisitor) {
		frameworkVisitor.setup(this);
	}

}
