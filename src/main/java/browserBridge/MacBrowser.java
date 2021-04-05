package browserBridge;

public class MacBrowser extends BrowserCall {

	public MacBrowser(String driverRef, String driverpath, InitiateDriver initiateDriver) {
		super(initiateDriver);
		
		// TODO Auto-generated constructor stub
	}


	public void InitiateBrowserCall() {
		// TODO Auto-generated method stub
		initiateDriver.remoteDriver();
	}

}
