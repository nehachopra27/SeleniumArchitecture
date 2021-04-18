package sample;

import org.openqa.selenium.By;

import elementConfig.ConfigElementImp;
import elementConfig.ConfigureElement;
import reporting.ExtentReportManager;
import reporting.ExtentReportManagerImp;
import userInterfaceActionUtil.SeleniumActions;
import userInterfaceActionUtil.SeleniumActionsImp;
import util.GlobalVariables._status;

public class LoginStepsImp implements LoginStep {

	SeleniumActions act = new SeleniumActionsImp();
	ExtentReportManager report = new ExtentReportManagerImp();
	ConfigureElement ele = new ConfigElementImp();
	LoginLocator loc = new LoginLocator();

	public void open_base_url(String scenario, String url) {
		if (act.getURL(url))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
	}

	public void click_on_signin_link(String scenario, By locator) {
		if (act.click(ele.getElement(loc.typ_lnk_SignIn, loc.loc_lnk_SignIn), 30))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

	public void enter_username(String scenario, By locator, String username) {
		if (act.sendKeyElement(ele.getElement(loc.typ_txt_username, loc.loc_txt_username), username, 30))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

	public void enter_password(String scenario, By locator, String password) {
		if (act.sendKeyElement(ele.getElement(loc.typ_txt_password, loc.loc_txt_password), password, 30))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

	public void click_on_submit_button(String scenario, By locator) {
		if (act.click(ele.getElement(loc.typ_btn_SignIn, loc.loc_btn_SignIn), 30))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

	public void validate_login_message_for_incorrect_credentials(String scenario, By locator, String errorMessage) {
		if (act.getText(ele.getElement(loc.typ_lbl_errorMessage, loc.loc_lbl_errorMessage), 30).equals(errorMessage))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

	public void validate_user_login_successfully(String scenario, String message) {
		if (act.validateTestExistOnPage(message))
			report.updateResult(_status.PASS, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		else
			report.updateResult(_status.BLOCKED, scenario, new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));

	}

}
