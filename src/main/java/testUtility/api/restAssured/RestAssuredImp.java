package testUtility.api.restAssured;


import io.restassured.RestAssured;
import testInit.GlobalVariables;

public class RestAssuredImp extends GlobalVariables implements RestAssuredActions {

	public boolean createRequestEndPoint(String baseURI) {
		try {
			RestAssured.baseURI = baseURI;
			_request = RestAssured.given();
			return true;
		} catch (Exception e) {
			log.error("not able to create request end point");
			log.error(e.getMessage());
			return false;
		}

	}

	public boolean addJsonParam(String key, String value) {
		try {
			_request.formParams(key, value);
			//requestParams.put(key, value);
			return true;
		} catch (Exception e) {
			log.error("not able to add param");
			log.error(e.getMessage());
			return false;
		}
	}

	public boolean addRequestHeader(String key, String value) {
		try {
			_request.header(key, value);
			return true;
		} catch (Exception e) {
			log.error("not able to add param");
			log.error(e.getMessage());
			return false;
		}
	}


	public boolean sendPostRequest(String queryString) {
		try {
			_response = _request.post(queryString);
			return true;
		} catch (Exception e) {
			log.error("not able to add body");
			log.error(e.getMessage());
			return false;
		}
	}

	public boolean validateResponseCode(int responseCode) {
		if(_response.getStatusCode() == responseCode) {
			
			return true;
		} else {
			return false;
		}
	}

}
