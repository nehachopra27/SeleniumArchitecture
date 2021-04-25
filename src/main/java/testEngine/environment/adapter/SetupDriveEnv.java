package testEngine.environment.adapter;

import testInit.GlobalVariables._browserName;
import testInit.GlobalVariables._systemType;

public class SetupDriveEnv implements Browser {
	BrowserAdapter browserAdapter;

	public void intiBrowser(_systemType systemType, _browserName browserName) {
		browserAdapter = new BrowserAdapter(systemType);
		browserAdapter.intiBrowser(systemType, browserName);
	}

}
