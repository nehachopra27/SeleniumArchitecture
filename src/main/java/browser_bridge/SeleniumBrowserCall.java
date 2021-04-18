package browser_bridge;

public abstract class SeleniumBrowserCall {
	protected InitiateDriver initiateDriver;
	protected SeleniumBrowserCall(InitiateDriver initiateDriver) {
		this.initiateDriver=initiateDriver;
	}
	public abstract void initiateSeleniumBrowserCall();
}
