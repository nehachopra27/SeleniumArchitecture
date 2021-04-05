package browserBridge;

public abstract class BrowserCall {
	protected InitiateDriver initiateDriver;
	protected BrowserCall(InitiateDriver initiateDriver) {
		this.initiateDriver=initiateDriver;
	}
	public abstract void InitiateBrowserCall();
}
