package environmentAdapter;


import browser_bridge.SeleniumBrowserCall;
import browser_bridge.ChromeBrowser;
import browser_bridge.IEBrowser;
import browser_bridge.SeleniumMacBrowser;
import javaUtil.JavaReadWriteHelperImp;
import util.GlobalVariables;
import browser_bridge.SafariBrowser;

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
