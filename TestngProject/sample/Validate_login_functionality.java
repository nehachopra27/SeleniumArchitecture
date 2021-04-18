package sample;

import org.testng.annotations.Test;

import elementConfig.ConfigElementImp;
import elementConfig.ConfigureElement;

public class Validate_login_functionality {

	LoginStep loginStep = new LoginStepsImp();
	LoginLocator loc = new LoginLocator();
	ConfigureElement ele = new ConfigElementImp();

	@Test(priority = 1)
	public void Precondition_to_validate_login_functionality() {
		loginStep.open_base_url(new Object() {
		}.getClass().getEnclosingMethod().getName().replace("_", " "), "http://a.testaddressbook.com/");
		loginStep.click_on_signin_link(new Object() {
		}.getClass().getEnclosingMethod().getName().replace("_", " "),
				ele.getElement(loc.typ_lnk_SignIn, loc.loc_lnk_SignIn));
	}

	@Test(priority = 2)
	public void validate_login_with_incorrect_username() {
		String scenario = new Object() {
		}.getClass().getEnclosingMethod().getName().replace("_", " ");
		loginStep.enter_username(scenario, ele.getElement(loc.typ_txt_username, loc.loc_txt_username),
				"demo12@demo.com");
		loginStep.enter_password(scenario, ele.getElement(loc.typ_txt_username, loc.loc_txt_username), "");
		loginStep.click_on_submit_button(scenario, ele.getElement(loc.typ_btn_SignIn, loc.loc_btn_SignIn));
		loginStep.validate_login_message_for_incorrect_credentials(scenario,
				ele.getElement(loc.typ_lbl_errorMessage, loc.loc_lbl_errorMessage), "Bad email or password.");
	}

	@Test(priority = 3)
	public void validate_login_with_incorrect_password() {
		String scenario = new Object() {
		}.getClass().getEnclosingMethod().getName().replace("_", " ");
		loginStep.enter_username(scenario, ele.getElement(loc.typ_txt_username, loc.loc_txt_username), "demo@demo.com");
		loginStep.enter_password(scenario, ele.getElement(loc.typ_txt_username, loc.loc_txt_username), "demo12");
		loginStep.click_on_submit_button(scenario, ele.getElement(loc.typ_btn_SignIn, loc.loc_btn_SignIn));
		loginStep.validate_login_message_for_incorrect_credentials(scenario,
				ele.getElement(loc.typ_lbl_errorMessage, loc.loc_lbl_errorMessage), "Bad email or password.");
	}

	@Test(priority = 4)
	public void validate_login_with_correct_credentials() {
		String scenario = new Object() {
		}.getClass().getEnclosingMethod().getName().replace("_", " ");
		loginStep.enter_username(scenario, ele.getElement(loc.typ_txt_username, loc.loc_txt_username), "demo@demo.com");
		loginStep.enter_password(scenario, ele.getElement(loc.typ_txt_username, loc.loc_txt_username), "demo");
		loginStep.click_on_submit_button(scenario, ele.getElement(loc.typ_btn_SignIn, loc.loc_btn_SignIn));
		loginStep.validate_user_login_successfully(scenario, "Welcome to Address Book");
	}

}
