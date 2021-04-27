package testengine.frame.interceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrameDispatcher implements TestFrameRequestInterceptor {

	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static FrameDispatcher instance;

	private FrameDispatcher() {
		// private constructor
	}

	public static FrameDispatcher getInstance() {
		if (null == instance) {
			// synchronized block to remove overhead
			synchronized (FrameDispatcher.class) {
				instance = new FrameDispatcher();

			}
		}
		return instance;
	}

	List<TestFrameRequestInterceptor> intercepter = new ArrayList<TestFrameRequestInterceptor>();

	public synchronized void registerFrameRequestInterceptor(TestFrameRequestInterceptor interceptor) {
		intercepter.add(interceptor);
	}

	public synchronized void removeFrameRequestInterceptor(TestFrameRequestInterceptor interceptor) {
		intercepter.remove(interceptor);
	}

	public void dispatchFrameworkRequestInterceptor(FrameworkUnmarshled context) throws IOException {
		synchronized (this) {
			intercepter = new ArrayList<TestFrameRequestInterceptor>(intercepter);
		}
		for (int i = 0; i < intercepter.size(); i++) {
			TestFrameRequestInterceptor myRequestInterceptor = intercepter.get(i);
			myRequestInterceptor.onPreInit();
			myRequestInterceptor.intiateLogs();
			myRequestInterceptor.intiateFrame(context);
			myRequestInterceptor.onPostFrameworkRequest(context);
		}
	}

	public void onPostFrameworkRequest(FrameworkUnmarshled context) {
		throw new UnsupportedOperationException();
	}

	public void intiateLogs() {
		throw new UnsupportedOperationException();
	}

	public void onPreInit() {
		throw new UnsupportedOperationException();
	}

	public void intiateFrame(FrameworkUnmarshled context) {
		throw new UnsupportedOperationException();
	}

}
