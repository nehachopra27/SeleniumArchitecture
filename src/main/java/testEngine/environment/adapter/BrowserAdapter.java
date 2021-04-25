package testEngine.environment.adapter;

import testInit.GlobalVariables._browserName;
import testInit.GlobalVariables._systemType;

public class BrowserAdapter implements Browser {

	BrowserSelector browserSelector;

	public BrowserAdapter(_systemType systemType) {
		switch (systemType) {
		case WINDOWS: {
			browserSelector = new Windows();
			break;
		}
		case MAC: {
			browserSelector = new MAC();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + systemType);
		}
	}

	public void intiBrowser(_systemType systemType, _browserName browserName) {
		switch (browserName) {
		case CHROME: {
			browserSelector.seleniumChrome();
			break;
		}
		case IE: {
			browserSelector.seleniumIE();
			break;
		}
		case SAFARI: {
			browserSelector.seleniumSafari();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + browserName);
		}
	}

}
