package environmentAdapter;

import globalUtilities.GlobalVariables.browserName;
import globalUtilities.GlobalVariables.systemType;

public class BrowserAdapter implements Browser {

	BrowserSelector browserSelector;

	public BrowserAdapter(systemType systemType) {
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

	@Override
	public void intiBrowser(systemType systemType, browserName browserName) {
		// TODO Auto-generated method stub
		switch (browserName) {
		case CHROME: {
			browserSelector.chrome();
			break;
		}
		case IE: {
			browserSelector.ie();
			break;
		}
		case SAFARI: {
			browserSelector.safari();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + browserName);
		}
	}

}
