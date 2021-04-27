package testengine.environment.adapter;


import testengine.browser.bridge.ChromeBrowser;
import testengine.browser.bridge.IEBrowser;
import testengine.browser.bridge.SafariBrowser;
import testengine.browser.bridge.SeleniumBrowserCall;
import testengine.browser.bridge.SeleniumMacBrowser;
import testinit.GlobalVariables;
import testutility.java.JavaReadWriteHelperImp;

public class MAC extends GlobalVariables implements BrowserSelector{

	
	JavaReadWriteHelperImp myJavaFun;
	public void seleniumChrome() {
		log.info("Initiate Chrome Browser for MAC");
		SeleniumBrowserCall myBrowserCall=new SeleniumMacBrowser(new ChromeBrowser());
		myBrowserCall.initiateSeleniumBrowserCall();
	}

	public void seleniumIE() {
		log.info("Initiate IE Browser for MAC");
		SeleniumBrowserCall myBrowserCall=new SeleniumMacBrowser(new IEBrowser());
		myBrowserCall.initiateSeleniumBrowserCall();
	}


	public void seleniumSafari() {
		log.info("Initiate safari Browser for MAC");
		SeleniumBrowserCall myBrowserCall=new SeleniumMacBrowser(new SafariBrowser());
		myBrowserCall.initiateSeleniumBrowserCall();
		log.info("safari MAC");
	}

}
