package testEngine.frame.visitor;

public class Frame implements FrameworkHandler {

	FrameworkHandler[] frameworkHandler;

	public Frame() {
		frameworkHandler = new FrameworkHandler[] { new SetupSourceRepo(), new SetupOutputRepo(), new SetupLogFile() };
	}

	public void frameAcceptance(FrameworkVisitor frameworkVisitor) {
		for (int i = 0; i < frameworkHandler.length; i++) {
			frameworkHandler[i].frameAcceptance(frameworkVisitor);
		}
		
	}

}
