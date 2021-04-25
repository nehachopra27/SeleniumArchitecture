package client.rest.restassured;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testInit.GlobalVariables._status;
import testUtility.api.restAssured.RestAssuredActions;
import testUtility.api.restAssured.RestAssuredImp;
import testUtility.reporting.ExtentReportManager;
import testUtility.reporting.ExtentReportManagerAPI;

public class LoginSteps {

	RestAssuredActions restAssured = new RestAssuredImp();
	ExtentReportManager report = new ExtentReportManagerAPI();
	Scenario scenario;

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("set base URI {string}")
	public void set_base_uri(String URI) {
		if (restAssured.createRequestEndPoint(URI)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set request header content-Type {string} {string}")
	public void set_request_header_content_type(String header, String value) {
		if (restAssured.addRequestHeader(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set request header Cookie {string} {string}")
	public void set_request_header_cookie(String header, String value) {
		if (restAssured.addRequestHeader(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set param utf8 {string} {string}")
	public void set_param_utf8(String header, String value) {
		if (restAssured.addJsonParam(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set param authenticity_token {string} {string}")
	public void set_param_authenticity_token(String header, String value) {
		if (restAssured.addJsonParam(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set param username {string} {string}")
	public void set_param_username(String header, String value) {
		if (restAssured.addJsonParam(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set param password {string} {string}")
	public void set_param_password(String header, String value) {
		if (restAssured.addJsonParam(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("set param action {string} {string}")
	public void set_param_action(String header, String value) {
		if (restAssured.addJsonParam(header, value)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}


	@Then("send post call {string}")
	public void send_post_call(String param) {
		if (restAssured.sendPostRequest(param)) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}

	@Then("validate response code {string}")
	public void validate_response_code(String response) {
		if (restAssured.validateResponseCode(Integer.parseInt(response))) {
			report.updateResult(_status.PASS, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		} else {
			report.updateResult(_status.FAIL, scenario.getName(), new Object() {
			}.getClass().getEnclosingMethod().getName().replace("_", " "));
		}
	}
}
