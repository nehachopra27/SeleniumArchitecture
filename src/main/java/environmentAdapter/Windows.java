package environmentAdapter;

import browserBridge.BrowserCall;
import browserBridge.WindowsBrowser;
import globalUtilities.GlobalVariables;
import browserBridge.ChromeBrowser;
import browserBridge.IEBrowser;

public class Windows extends GlobalVariables implements BrowserSelector{

	
	
	
	@Override
	public void chrome() {
		// TODO Auto-generated method stub
		System.out.println("chrome windows");
		BrowserCall myBrowserCall=new WindowsBrowser(new ChromeBrowser());
		myBrowserCall.InitiateBrowserCall();
		
	}

	@Override
	public void ie() {
		// TODO Auto-generated method stub
		System.out.println("ie windows");
		BrowserCall myBrowserCall=new WindowsBrowser(new IEBrowser());
		myBrowserCall.InitiateBrowserCall();
	}


	@Override
	public void safari() {
		// TODO Auto-generated method stub
		System.out.println("safari driver is not available");
	}

}
