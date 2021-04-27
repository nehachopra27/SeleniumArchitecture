package client.web.ui.testng;

import testinit.GlobalVariables.ElementType;

public class LoginLocator {

	public ElementType typ_lnk_SignIn=ElementType.BYID;
	public ElementType typ_txt_username=ElementType.BYID;
	public ElementType typ_txt_password=ElementType.BYID;
	public ElementType typ_btn_SignIn=ElementType.BYXPATH;
	public ElementType typ_lbl_errorMessage=ElementType.BYXPATH;
	
	
	
	public String loc_lnk_SignIn="sign-in";
	public String loc_txt_username="session_email";
	public String loc_txt_password="session_password";
	public String loc_btn_SignIn="//input[contains(@type, 'submit')]";
	public String loc_lbl_errorMessage="//div[normalize-space(@class) = 'alert alert-notice']";
}
