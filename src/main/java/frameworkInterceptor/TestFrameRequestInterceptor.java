package frameworkInterceptor;

public interface TestFrameRequestInterceptor {
	public void onPreInit();
	public void intiateLogs();
	public void intiateReports(FrameworkUnmarshled context);
	public void intiateFrame(FrameworkUnmarshled context);
	public void onPostFrameworkRequest();

}
