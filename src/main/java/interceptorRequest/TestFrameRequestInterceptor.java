package interceptorRequest;

import unmarshaledRequest.FrameworkUnmarshled;

public interface TestFrameRequestInterceptor {
	public void onPreFrameworkRequest(FrameworkUnmarshled context);
	public void onTest();
	public void onPostFrameworkRequest();
	
}
