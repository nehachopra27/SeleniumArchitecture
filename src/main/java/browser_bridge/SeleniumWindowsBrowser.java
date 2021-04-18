package browser_bridge;

public class SeleniumWindowsBrowser extends SeleniumBrowserCall {

	public SeleniumWindowsBrowser(InitiateDriver initiateDriver) {
		super(initiateDriver);
	}


	public void initiateSeleniumBrowserCall() {
		initiateDriver.selniumRemoteDriver();
	}

}
