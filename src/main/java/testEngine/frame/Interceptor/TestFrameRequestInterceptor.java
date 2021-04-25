package testEngine.frame.Interceptor;

public interface TestFrameRequestInterceptor {
	public void onPreInit();
	public void intiateLogs();
	public void intiateFrame(FrameworkUnmarshled context);
	public void onPostFrameworkRequest(FrameworkUnmarshled context);

}
