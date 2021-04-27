package testengine.frame.interceptor;

import testinit.GlobalVariables.BrowserName;
import testinit.GlobalVariables.EnvironmentName;
import testinit.GlobalVariables.FrameworkName;
import testinit.GlobalVariables.SystemType;
import testinit.GlobalVariables.TestingFrame;
import testinit.GlobalVariables.TestingTypes;

public class FrameworkImplementation implements FrameworkUnmarshled {
	String testProject;
	EnvironmentName testEnvironment;
	TestingTypes testType;
	SystemType testSystem;
	BrowserName testBrowser;
	String testFeature;
	String testngXML;
	FrameworkName frameworkName;
	TestingFrame testingFrame;

	public String getTestProject() {
		return testProject;
	}

	public void setTestProject(String testProject) {
		this.testProject = testProject;
	}

	public EnvironmentName getTestEnvironment() {
		return testEnvironment;
	}

	public void setTestEnvironment(EnvironmentName testEnvironment) {
		this.testEnvironment = testEnvironment;
	}

	public TestingTypes getTestType() {
		return testType;
	}

	public void setTestType(TestingTypes testType) {
		this.testType = testType;
	}

	public SystemType getTestSystem() {
		return testSystem;
	}

	public void setTestSystem(SystemType testSystem) {
		this.testSystem = testSystem;
	}

	public BrowserName getTestBrowser() {
		return testBrowser;
	}

	public void setTestBrowser(BrowserName testBrowser) {
		this.testBrowser = testBrowser;
	}

	public String getTestFeature() {
		return testFeature;
	}

	public void setTestFeature(String testFeature) {
		this.testFeature = testFeature;
	}

	public String getTestngXML() {
		return testngXML;
	}

	public void setTestngXML(String testngXML) {
		this.testngXML = testngXML;

	}

	public void setFrameworkName(FrameworkName frameworkName) {
		this.frameworkName = frameworkName;
	}

	public FrameworkName getFrameworkName() {
		return frameworkName;
	}

	public TestingFrame getTestTypeFrame() {
		return testingFrame;
	}

	public void setTestTypeFrame(TestingFrame testingFrame) {
		this.testingFrame=testingFrame;
	}

}
