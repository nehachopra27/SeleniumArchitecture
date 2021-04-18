package frameworkInterceptor;

import util.GlobalVariables._browserName;
import util.GlobalVariables._environmentName;
import util.GlobalVariables._frameworkName;
import util.GlobalVariables._systemType;
import util.GlobalVariables._testingFrame;
import util.GlobalVariables._testingType;

public class FrameworkImplementation implements FrameworkUnmarshled {
	String testProject;
	_environmentName testEnvironment;
	_testingType testType;
	_systemType testSystem;
	_browserName testBrowser;
	String testFeature;
	String testngXML;
	_frameworkName frameworkName;
	_testingFrame testingFrame;

	public String getTestProject() {
		return testProject;
	}

	public void setTestProject(String testProject) {
		this.testProject = testProject;
	}

	public _environmentName getTestEnvironment() {
		return testEnvironment;
	}

	public void setTestEnvironment(_environmentName testEnvironment) {
		this.testEnvironment = testEnvironment;
	}

	public _testingType getTestType() {
		return testType;
	}

	public void setTestType(_testingType testType) {
		this.testType = testType;
	}

	public _systemType getTestSystem() {
		return testSystem;
	}

	public void setTestSystem(_systemType testSystem) {
		this.testSystem = testSystem;
	}

	public _browserName getTestBrowser() {
		return testBrowser;
	}

	public void setTestBrowser(_browserName testBrowser) {
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

	public void setFrameworkName(_frameworkName frameworkName) {
		this.frameworkName = frameworkName;
	}

	public _frameworkName getFrameworkName() {
		return frameworkName;
	}

	public _testingFrame getTestTypeFrame() {
		return testingFrame;
	}

	public void setTestTypeFrame(_testingFrame testingFrame) {
		this.testingFrame=testingFrame;
	}

}
