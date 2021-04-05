package frameworkInterceptor;

import globalUtilities.GlobalVariables.browserName;
import globalUtilities.GlobalVariables.environmentName;
import globalUtilities.GlobalVariables.systemType;
import globalUtilities.GlobalVariables.testingType;

public class FrameworkImplementation implements FrameworkUnmarshled {
	public String testProject;
	public environmentName testEnvironment;
	public testingType testType;
	public systemType testSystem;
	public browserName testBrowser;
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
	public environmentName getTestEnvironment() {
		return testEnvironment;
	}

	@Override
	public void setTestEnvironment(environmentName testEnvironment) {
		this.testEnvironment = testEnvironment;
	}

	@Override
	public testingType getTestType() {
		return testType;
	}

	@Override
	public void setTestType(testingType testType) {
		this.testType = testType;
	}

	@Override
	public systemType getTestSystem() {
		return testSystem;
	}

	@Override
	public void setTestSystem(systemType testSystem) {
		this.testSystem = testSystem;
	}

	@Override
	public browserName getTestBrowser() {
		return testBrowser;
	}

	@Override
	public void setTestBrowser(browserName testBrowser) {
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
