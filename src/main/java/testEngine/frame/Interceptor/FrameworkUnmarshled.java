package testEngine.frame.Interceptor;


import testInit.GlobalVariables._browserName;
import testInit.GlobalVariables._environmentName;
import testInit.GlobalVariables._frameworkName;
import testInit.GlobalVariables._systemType;
import testInit.GlobalVariables._testingFrame;
import testInit.GlobalVariables._testingType;

public interface FrameworkUnmarshled {

	public String getTestProject();
	public void setTestProject(String testProject);
	public _environmentName getTestEnvironment();
	public void setTestEnvironment(_environmentName testEnvironment);
	public _testingType getTestType();
	public void setTestType(_testingType testType);
	public _testingFrame getTestTypeFrame();
	public void setTestTypeFrame(_testingFrame testingFrame);
	public _systemType getTestSystem();
	public void setTestSystem(_systemType testSystem);
	public _browserName getTestBrowser();
	public void setTestBrowser(_browserName testBrowser);
	public String getTestFeature();
	public void setTestFeature(String testFeature);
	public String getTestngXML();
	public void setTestngXML(String testngXML);
	public _frameworkName getFrameworkName();
	public void setFrameworkName(_frameworkName frameworkName);

}
