package InitiateTesting;

import InitiateTesting.GlobalValueSet.frameworkName;
import dispatcher.FrameDispatcher;
import interceptorRequest.TestFrameRequestInterceptor;
import unmarshaledRequest.FrameworkUnmarshled;

public class TestExecuter {

	
	public void testInitiator(FrameworkUnmarshled context, frameworkName frame)  {
		TestFrameRequestInterceptor frameInterceptor = new TestFrameRequestInterceptor() {
		

			@Override
			public void onPreFrameworkRequest(FrameworkUnmarshled context) {
				// TODO Auto-generated method stub
				System.out.println("pre"+context.getTestBrowser());
			}

			@Override
			public void onPostFrameworkRequest() {
				// TODO Auto-generated method stub
				System.out.println("post");
			}

			@Override
			public void onTest() {
				// TODO Auto-generated method stub
				System.out.println("Test");
			}

		};
				
		
		FrameDispatcher.getInstance().registerFrameRequestInterceptor(frameInterceptor); 
		FrameDispatcher.getInstance().dispatchFrameworkRequestInterceptor(context);
		FrameDispatcher.getInstance().removeFrameRequestInterceptor(frameInterceptor);
		
	}


}
