package testengine.frame.interceptor;

import java.io.IOException;

public interface TestFrameRequestInterceptor {
	public void onPreInit() throws IOException;
	public void intiateLogs();
	public void intiateFrame(FrameworkUnmarshled context);
	public void onPostFrameworkRequest(FrameworkUnmarshled context);

}
