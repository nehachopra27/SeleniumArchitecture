package environmentAdapter;


import browser_bridge.SeleniumBrowserCall;
import browser_bridge.ChromeBrowser;
import browser_bridge.IEBrowser;
import browser_bridge.SeleniumWindowsBrowser;
import javaUtil.JavaReadWriteHelperImp;
import util.GlobalVariables;

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
