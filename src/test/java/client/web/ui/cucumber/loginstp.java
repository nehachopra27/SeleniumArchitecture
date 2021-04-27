package client.web.ui.cucumber;


import client.web.ui.testng.LoginLocator;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testinit.GlobalVariables;
import testutility.reporting.ExtentReportManager;
import testutility.reporting.ExtentReportManagerUI;
import testutility.ui.selenium.SeleniumActions;
import testutility.ui.selenium.SeleniumActionsImp;
import testutility.ui.selenium.element.config.ConfigElementImp;
import testutility.ui.selenium.element.config.ConfigureElement;

public class loginstp extends GlobalVariables {

	SeleniumActions act = new SeleniumActionsImp();
	ExtentReportManager report = new ExtentReportManagerUI();
	ConfigureElement ele = new ConfigElementImp();
	Scenario scenario;
	LoginLocator loc = new LoginLocator();

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("open base url {string}")
	public void open_base_url(String url) {
		if (act.getURL(url))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

	@Then("click on signin link")
	public void click_on_signin_link() {
		if (act.click(ele.getElement(loc.typ_lnk_SignIn, loc.loc_lnk_SignIn), 30))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

	@Given("enter username {string}")
	public void enter_username(String username) {
		if (act.sendKeyElement(ele.getElement(loc.typ_txt_username, loc.loc_txt_username), username, 30))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

	@Given("enter password {string}")
	public void enter_password(String password) {
		if (act.sendKeyElement(ele.getElement(loc.typ_txt_password, loc.loc_txt_password), password, 30))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

	@Given("click on submit button")
	public void click_on_submit_button() {
		if (act.click(ele.getElement(loc.typ_btn_SignIn, loc.loc_btn_SignIn), 30))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

	@Then("validate login message {string} for incorrect credentials")
	public void validate_login_message_for_incorrect_credentials(String errorMessage) {
		if (act.getText(ele.getElement(loc.typ_lbl_errorMessage, loc.loc_lbl_errorMessage), 30).equals(errorMessage))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

	@Then("validate user login successfully {string}")
	public void validate_user_login_successfully(String loginMessage) {
		if (act.validateTextExistOnPage(loginMessage))
			report.updateResult(TestStatus.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(TestStatus.BLOCKED, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

}
