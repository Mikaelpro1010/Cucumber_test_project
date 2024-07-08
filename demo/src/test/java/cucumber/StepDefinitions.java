package cucumber;


import cucumber.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {
    private LoginPage loginPage;
    
    @Given("User is on Homepage")
    public void user_is_on_homepage_scenario() {
        this.loginPage = new LoginPage();
    }

    @Given("User clicks on the login button")
    public void user_clicks_on_the_login_scenario() {

        loginPage.clicarLogin("//*[@id=\"login\"]/button");
    }

    @When("User enters a name on username field")
    public void user_enters_a_name_on_name_field_scenario() {

        loginPage.preencherCampoXpath("//*[@id=\"username\"]", "tomsmith");
    }

    @When("User enters an password on password field")
    public void user_enters_an_password_on_password_field() {
        loginPage.preencherCampoXpath("//*[@id=\"password\"]", "SuperSecretPassword!");     
    }
    
    @Then("User should be redirectioned to SignUp page")
    public void user_should_be_redirectioned_to_sign_up_page() {
        loginPage.paginaCerta("https://the-internet.herokuapp.com/secure");
        loginPage.verificarTextoPorXpath("//*[@id=\"flash\"]","You logged into a secure area!");
    }
}
