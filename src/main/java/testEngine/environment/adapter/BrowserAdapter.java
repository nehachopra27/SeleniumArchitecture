package testengine.environment.adapter;

import testinit.GlobalVariables.BrowserName;
import testinit.GlobalVariables.SystemType;

public class BrowserAdapter implements Browser {

	BrowserSelector browserSelector;

	public BrowserAdapter(SystemType systemType) {
		switch (systemType) {
		case WINDOWS: 
			browserSelector = new Windows();
			break;
		case MAC: 
			browserSelector = new MAC();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + systemType);
		}
	}

	public void intiBrowser(SystemType systemType, BrowserName browserName) {
		switch (browserName) {
		case CHROME: 
			browserSelector.seleniumChrome();
			break;
		case IE: 
			browserSelector.seleniumIE();
			break;
		case SAFARI: 
			browserSelector.seleniumSafari();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + browserName);
		}
	}

}
