package RestAssuredStepDefnition;

import java.io.IOException;

import API.CreateUserApi;
import Base.base;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createUserStepDefinitions extends base {

	CreateUserApi api = new CreateUserApi();

//	@Before
//	public void init() {
//		base.setup();
//	}

	@Given("I pass the username and password and accesstoken should generated")
	public void i_pass_the_username_and_password_and_accesstoken_should_generated() throws IOException {
		base.setup();
		api.getAccessToken();

	}

	@When("I pass the accesstoken and post a request")
	public void i_pass_the_accesstoken_and_post_a_request() {
		api.createUser();

	}

	@Then("Order should be created")
	public void order_should_be_created() {
		api.VerificationOfCreateUser();
	}

}
