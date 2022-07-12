package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("1 step");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("2 step");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("3 step");
    }
    @Then("the user should be logged successfully")
    public void the_user_should_be_logged_successfully() {
        System.out.println("4 step");
    }
}
