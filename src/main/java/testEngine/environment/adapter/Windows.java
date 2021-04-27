package testengine.environment.adapter;


import testengine.browser.bridge.ChromeBrowser;
import testengine.browser.bridge.IEBrowser;
import testengine.browser.bridge.SeleniumBrowserCall;
import testengine.browser.bridge.SeleniumWindowsBrowser;
import testinit.GlobalVariables;
import testutility.java.JavaReadWriteHelperImp;

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
