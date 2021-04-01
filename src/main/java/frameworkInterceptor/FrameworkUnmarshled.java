package frameworkInterceptor;

import globalUtilities.GlobalVariables.browserName;
import globalUtilities.GlobalVariables.environmentName;
import globalUtilities.GlobalVariables.systemType;
import globalUtilities.GlobalVariables.testingType;

public interface FrameworkUnmarshled {

	public String getTestProject();
	public void setTestProject(String testProject);
	public environmentName getTestEnvironment();
	public void setTestEnvironment(environmentName testEnvironment);
	public testingType getTestType();
	public void setTestType(testingType testType);
	public systemType getTestSystem();
	public void setTestSystem(systemType testSystem);
	public browserName getTestBrowser();
	public void setTestBrowser(browserName testBrowser);
	public String getTestFeature();
	public void setTestFeature(String testFeature);
	public String getTestngXML();
	public void setTestngXML(String testngXML);
}
