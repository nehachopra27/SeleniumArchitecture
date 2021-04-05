package frameworkInterceptor;

public interface TestFrameRequestInterceptor {
	public void intiateLogs();
	public void intiateReports();
	public void intiateFrameRequest(FrameworkUnmarshled context);
	public void onPostFrameworkRequest();
}
