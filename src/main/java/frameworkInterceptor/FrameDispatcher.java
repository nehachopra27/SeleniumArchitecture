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
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (FrameDispatcher.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new FrameDispatcher();
				}

			}
		}
		return instance;
	}

	Vector<TestFrameRequestInterceptor> intercepter_ = new Vector<TestFrameRequestInterceptor>();

	synchronized public void registerFrameRequestInterceptor(TestFrameRequestInterceptor interceptor) {
		intercepter_.add(interceptor);
	}

	synchronized public void removeFrameRequestInterceptor(TestFrameRequestInterceptor interceptor) {
		intercepter_.remove(interceptor);
	}

	@SuppressWarnings("unchecked")
	public void dispatchFrameworkRequestInterceptor(FrameworkUnmarshled context) {
		synchronized (this) {
			intercepter_ = (Vector<TestFrameRequestInterceptor>) intercepter_.clone();
		}
		for (int i = 0; i < intercepter_.size(); i++) {
			TestFrameRequestInterceptor myRequestInterceptor = (TestFrameRequestInterceptor) intercepter_.elementAt(i);
			myRequestInterceptor.intiateLogs();
			myRequestInterceptor.intiateReports();
			myRequestInterceptor.intiateFrameRequest(context);
			myRequestInterceptor.onPostFrameworkRequest();
		}
	}

	@Override
	public void onPostFrameworkRequest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void intiateLogs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void intiateReports() {
		// TODO Auto-generated method stub

	}

	@Override
	public void intiateFrameRequest(FrameworkUnmarshled context) {
		// TODO Auto-generated method stub

	}

}
