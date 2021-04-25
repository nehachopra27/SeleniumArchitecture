package testEngine.environment.adapter;


import testEngine.browser.bridge.ChromeBrowser;
import testEngine.browser.bridge.IEBrowser;
import testEngine.browser.bridge.SeleniumBrowserCall;
import testEngine.browser.bridge.SeleniumWindowsBrowser;
import testInit.GlobalVariables;
import testUtility.java.JavaReadWriteHelperImp;

public class Windows extends GlobalVariables implements BrowserSelector{

	
	JavaReadWriteHelperImp myJavaFun;
	public void seleniumChrome() {

		log.info("Initiate Chrome Browser for windows");
		SeleniumBrowserCall myBrowserCall=new SeleniumWindowsBrowser(new ChromeBrowser());
		myBrowserCall.initiateSeleniumBrowserCall();
	}

	public void seleniumIE() {
		log.info("Initiate IE Browser for windows");
		SeleniumBrowserCall myBrowserCall=new SeleniumWindowsBrowser(new IEBrowser());
		myBrowserCall.initiateSeleniumBrowserCall();
	}


	public void seleniumSafari() {
		log.info("Safari browser is not configured for windows");
		
	}

}
