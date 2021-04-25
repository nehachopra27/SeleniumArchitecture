package client.web.ui.cucumber;

import testInit.GlobalVariables._elementType;

public class Locator {

	public _elementType typ_lnk_SignIn=_elementType.ByID;
	public _elementType typ_txt_username=_elementType.ByID;
	public _elementType typ_txt_password=_elementType.ByID;
	public _elementType typ_btn_SignIn=_elementType.ByXpath;
	public _elementType typ_lbl_errorMessage=_elementType.ByXpath;
	
	
	
	public String loc_lnk_SignIn="sign-in";
	public String loc_txt_username="session_email";
	public String loc_txt_password="session_password";
	public String loc_btn_SignIn="//input[contains(@type, 'submit')]";
	public String loc_lbl_errorMessage="//div[normalize-space(@class) = 'alert alert-notice']";
}
