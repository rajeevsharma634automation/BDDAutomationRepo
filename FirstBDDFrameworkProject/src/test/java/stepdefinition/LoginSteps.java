package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("First Step: User is landed to the login page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Second Step: User enters username and password");

	}

	@When("Clicks on login page")
	public void clicks_on_login_page() {
		System.out.println("Third Step: User click on login page");

	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Fourth Step: User navigated to home page");

	}
}
