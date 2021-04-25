package testEngine.frame.visitor;


public interface FrameworkVisitor {
	public void setup(SetupSourceRepo setupSourceRepo);

	public void setup(SetupOutputRepo setupOutputRepo);

	public void setup(SetupLogFile setupLogFile);
}
