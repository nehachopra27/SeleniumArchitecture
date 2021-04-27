package client.web.ui.testng;

import org.openqa.selenium.By;

public interface LoginStep {

	public void open_base_url(String scenario,String url);
	public void click_on_signin_link(String scenario,By locator);
	public void enter_username(String scenario,By locator,String username);
	public void enter_password(String scenario,By locator,String password);
	public void click_on_submit_button(String scenario,By locator);
	public void validate_login_message_for_incorrect_credentials(String scenario,By locator,String errorMessage);
	public void validate_user_login_successfully(String scenario,String message);
}
