package testengine.testabstract.factory;

import testinit.GlobalVariables.TestingFrame;

public abstract class TestingAbstractFactory {
	public abstract TestingType getTestingType(TestingFrame testingFrame);
}
