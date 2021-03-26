package InitiateTesting;

public class GlobalValueSet {
	
	public static String projectName;

	public static enum environmentName {
		TEST, STAGE, PROD
	}

	public static enum testingType {
		UI, API, DATABASE
	}
	
	public static enum systemType {
		WINDOWS,MAC,ANDROID
	}
	
	public static enum browserName {
		CHROME,IE,Safari
	}
	
	public static enum frameworkName {
		CUCUMBER,TESTNG,DATADRIVEN,
	}
	
	public static String moduleName;
}
