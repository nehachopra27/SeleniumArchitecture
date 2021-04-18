package frameworkInterceptor;

import java.util.Vector;

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
				if (null == instance) {
					// if instance is null, initialize
					instance = new FrameDispatcher();
				}

			}
		}
		return instance;
	}

	Vector<TestFrameRequestInterceptor> intercepter_ = new Vector<TestFrameRequestInterceptor>();

	public synchronized void registerFrameRequestInterceptor(TestFrameRequestInterceptor interceptor) {
		intercepter_.add(interceptor);
	}

	public synchronized void removeFrameRequestInterceptor(TestFrameRequestInterceptor interceptor) {
		intercepter_.remove(interceptor);
	}

	@SuppressWarnings("unchecked")
	public void dispatchFrameworkRequestInterceptor(FrameworkUnmarshled context) {
		synchronized (this) {
			intercepter_ = (Vector<TestFrameRequestInterceptor>) intercepter_.clone();
		}
		for (int i = 0; i < intercepter_.size(); i++) {
			TestFrameRequestInterceptor myRequestInterceptor = intercepter_.elementAt(i);
			myRequestInterceptor.onPreInit();
			myRequestInterceptor.intiateLogs();
			myRequestInterceptor.intiateReports(context);
			myRequestInterceptor.intiateFrame(context);
			myRequestInterceptor.onPostFrameworkRequest();
		}
	}

	public void onPostFrameworkRequest() {
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

	public void intiateReports(FrameworkUnmarshled context) {
		throw new UnsupportedOperationException();
	}

}
