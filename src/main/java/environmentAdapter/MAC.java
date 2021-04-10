package environmentAdapter;

import browserBridge.BrowserCall;
import browserBridge.ChromeBrowser;
import browserBridge.IEBrowser;
import browserBridge.MacBrowser;
import browserBridge.SafariBrowser;

public class MAC implements BrowserSelector{

	@Override
	public void chrome() {
		// TODO Auto-generated method stub
		System.out.println("chrome MAC");
		BrowserCall myBrowserCall=new MacBrowser("a", "b", new ChromeBrowser());
		myBrowserCall.InitiateBrowserCall();
	}

	@Override
	public void ie() {
		// TODO Auto-generated method stub
		System.out.println("IE MAC");
		BrowserCall myBrowserCall=new MacBrowser("a", "b", new IEBrowser());
		myBrowserCall.InitiateBrowserCall();
	}


	@Override
	public void safari() {
		// TODO Auto-generated method stub
		BrowserCall myBrowserCall=new MacBrowser("a", "b", new SafariBrowser());
		myBrowserCall.InitiateBrowserCall();
		System.out.println("safari MAC");
	}

}
