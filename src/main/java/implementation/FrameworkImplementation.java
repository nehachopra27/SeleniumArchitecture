package implementation;

import unmarshaledRequest.FrameworkUnmarshled;

public class FrameworkImplementation implements FrameworkUnmarshled {
	public String testProject;
	public String testEnvironment;
	public String testType;
	public String testSystem;
	public String testBrowser;
	public String testFeature;
	public String testngXML;

	@Override
	public String getTestProject() {
		return testProject;
	}

	@Override
	public void setTestProject(String testProject) {
		this.testProject = testProject;
	}

	@Override
	public String getTestEnvironment() {
		return testEnvironment;
	}

	@Override
	public void setTestEnvironment(String testEnvironment) {
		this.testEnvironment = testEnvironment;
	}

	@Override
	public String getTestType() {
		return testType;
	}

	@Override
	public void setTestType(String testType) {
		this.testType = testType;
	}

	@Override
	public String getTestSystem() {
		return testSystem;
	}

	@Override
	public void setTestSystem(String testSystem) {
		this.testSystem = testSystem;
	}

	@Override
	public String getTestBrowser() {
		return testBrowser;
	}

	@Override
	public void setTestBrowser(String testBrowser) {
		this.testBrowser = testBrowser;
	}

	@Override
	public String getTestFeature() {
		return testFeature;
	}

	@Override
	public void setTestFeature(String testFeature) {
		this.testFeature = testFeature;
	}

	@Override
	public String getTestngXML() {
		return testngXML;
	}

	@Override
	public void setTestngXML(String testngXML) {
		this.testngXML = testngXML;

	}
}
