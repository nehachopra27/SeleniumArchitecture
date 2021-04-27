package testengine.environment.adapter;

import testinit.GlobalVariables.BrowserName;
import testinit.GlobalVariables.SystemType;

public class SetupDriveEnv implements Browser {
	BrowserAdapter browserAdapter;

	public void intiBrowser(SystemType systemType, BrowserName browserName) {
		browserAdapter = new BrowserAdapter(systemType);
		browserAdapter.intiBrowser(systemType, browserName);
	}

}
