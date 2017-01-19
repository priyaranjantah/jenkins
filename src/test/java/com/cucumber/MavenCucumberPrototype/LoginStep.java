package com.cucumber.MavenCucumberPrototype;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by tahp1 on 1/18/2017.
 */
public class LoginStep {

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see  userform page");
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I print out the username and password");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on the login button");
    }

    @Then("^Login should see the userform page$")
    public void loginShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I view the userform page");
    }


    }

