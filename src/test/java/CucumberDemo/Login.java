package CucumberDemo;

import io.cucumber.java.en.*;

public class Login {
    @Given("Navigate to test titans website")
    public void navigate_to_test_titans_website() {
        System.out.println("Navigated to test titans website");
    }

    @Given("user enters the login id {string}")
    public void user_enters_the_login_id(String email) {
        System.out.println("User enters correct email"+ email);
    }
    @Given("user enters the correct password {string}")
    public void user_enters_the_correct_password(String pass) {
        System.out.println("User enters correct password"+ pass);
    }
    @When("users click on login button")
    public void users_click_on_login_button() {
        System.out.println("User clicked on login button");
    }
    @Then("user should be able to login in")
    public void user_should_be_able_to_login_in() {
        System.out.println("User logged in");

    }
    @Given("user enters the incorrect login id {string}")
    public void user_enters_the_incorrect_login_id(String email) {
        System.out.println("User enters incorrect email"+ email);
    }
    @Given("user enters the incorrect password {string}")
    public void user_enters_the_incorrect_password(String pass) {
        System.out.println("User enters incorrect password"+ pass);
    }
    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        System.out.println("User login failed");
    }
}
