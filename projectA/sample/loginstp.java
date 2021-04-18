package sample;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import reporting.ExtentReportManager;
import reporting.ExtentReportManagerImp;
import userInterfaceActionUtil.SeleniumActions;
import userInterfaceActionUtil.SeleniumActionsImp;
import util.GlobalVariables;

public class loginstp extends GlobalVariables {

	static String methodname = null;
	SeleniumActions act = new SeleniumActionsImp();
	ExtentReportManager report = new ExtentReportManagerImp();
	Scenario scenario;

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("open base url {string}")
	public void open_base_url(String url) {
		// Write code here that turns the phrase above into concrete actions
		act.getURL(url);
		methodname =  new Object(){}.getClass().getEnclosingMethod().getName().replace("_", " ");
		testInfo = reports.createTest(scenario.getName(), methodname);
		report.updateResult(_status.PASS, "passText", "failText", "expectedResult", pathScreenshot);
		testInfo = reports.createTest("methodname1", "methodname12");
		report.updateResult(_status.PASS, "passText", "failText", "expectedResult", pathScreenshot);
	}

}
