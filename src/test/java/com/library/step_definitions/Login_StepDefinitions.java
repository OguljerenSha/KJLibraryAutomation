package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {
    @Given("user login as a {string}")
    public void user_login_as_a(String user) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(user);
    }




    @Then("user should land on {string} module")
    public void user_should_land_on_module(String page) {

        String currentUrl = Driver.getDriver().getCurrentUrl();

        System.out.println(currentUrl);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        wait.until(ExpectedConditions.urlContains(page));

       // Assert.assertTrue(currentUrl.contains(page));
    }

}
