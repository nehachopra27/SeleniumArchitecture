package environmentAdapter;

import globalUtilities.GlobalVariables.browserName;
import globalUtilities.GlobalVariables.systemType;

public class SetupDriveEnv implements Browser {
	BrowserAdapter browserAdapter;

	@Override
	public void intiBrowser(systemType systemType, browserName browserName) {
		// TODO Auto-generated method stub
		browserAdapter = new BrowserAdapter(systemType);
		browserAdapter.intiBrowser(systemType, browserName);
	}

}
