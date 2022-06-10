package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_register;
import pages.P02_login;

import static stepDefinitions.Hooks.driver;

public class D02_loginStepDef {
    @Given("go to homepage")
    public void navigate_to_homepage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("click login tab")
    public void click_login_tab()
    {
        P02_login.click_login_tab();
    }
    @And("enter username and password")
    public void enter_username_and_password()
    {
        P01_register.enterEmail();
        P01_register.password();
    }
    @And("click LOGIN button")
    public void click_LOGIN_button()
    {
        P02_login.click_LOGIN_button();
    }
    @Then("login page")
    public void login_page()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }

}
