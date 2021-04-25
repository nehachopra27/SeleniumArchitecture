package testEngine.browser.bridge;

public class SeleniumMacBrowser extends SeleniumBrowserCall {

	public SeleniumMacBrowser(InitiateDriver initiateDriver) {
		super(initiateDriver);
		
	}


	public void initiateSeleniumBrowserCall() {
		initiateDriver.selniumRemoteDriver();
	}

}
