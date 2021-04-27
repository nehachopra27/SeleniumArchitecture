package testengine.frame.interceptor;


import testinit.GlobalVariables.BrowserName;
import testinit.GlobalVariables.EnvironmentName;
import testinit.GlobalVariables.FrameworkName;
import testinit.GlobalVariables.SystemType;
import testinit.GlobalVariables.TestingFrame;
import testinit.GlobalVariables.TestingTypes;

public interface FrameworkUnmarshled {

	public String getTestProject();
	public void setTestProject(String testProject);
	public EnvironmentName getTestEnvironment();
	public void setTestEnvironment(EnvironmentName testEnvironment);
	public TestingTypes getTestType();
	public void setTestType(TestingTypes testType);
	public TestingFrame getTestTypeFrame();
	public void setTestTypeFrame(TestingFrame testingFrame);
	public SystemType getTestSystem();
	public void setTestSystem(SystemType testSystem);
	public BrowserName getTestBrowser();
	public void setTestBrowser(BrowserName testBrowser);
	public String getTestFeature();
	public void setTestFeature(String testFeature);
	public String getTestngXML();
	public void setTestngXML(String testngXML);
	public FrameworkName getFrameworkName();
	public void setFrameworkName(FrameworkName frameworkName);

}
