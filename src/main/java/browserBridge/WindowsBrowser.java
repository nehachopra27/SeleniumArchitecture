package browserBridge;

public class WindowsBrowser extends BrowserCall {

	public WindowsBrowser(InitiateDriver initiateDriver) {
		super(initiateDriver);
		// TODO Auto-generated constructor stub
	}


	public void InitiateBrowserCall() {
		// TODO Auto-generated method stub
		initiateDriver.remoteDriver();
	}

}
