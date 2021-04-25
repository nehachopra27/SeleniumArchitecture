package testEngine.environment.adapter;


import testEngine.browser.bridge.ChromeBrowser;
import testEngine.browser.bridge.IEBrowser;
import testEngine.browser.bridge.SafariBrowser;
import testEngine.browser.bridge.SeleniumBrowserCall;
import testEngine.browser.bridge.SeleniumMacBrowser;
import testInit.GlobalVariables;
import testUtility.java.JavaReadWriteHelperImp;

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
		System.out.println("safari MAC");
	}

}
