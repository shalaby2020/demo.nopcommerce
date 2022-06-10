package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.P01_register;
import pages.P02_login;

import static stepDefinitions.Hooks.driver;

public class D03_resetPasswordStepDef {
    @Given("go to the homepage")
    public void navigate_to_homepage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("click login Link text")
    public void clickLoginLinkText() {
        P02_login.click_login_tab();

    }

    @And("click Forgot password link text")
    public void clickForgotPasswordLinkText() {
        driver.findElement(By.linkText("Forgot password?")).click();

    }

    @And("enter user email")
    public void enterUserEmail() {
        P01_register.enterEmail();

    }

    @And("click recover button")
    public void clickRecoverButton() {
        driver.findElement(By.name("send-email")).click();
    }
    @Then("recovery page")
    public void recovery_page()
    {
        System.out.println("Email with instructions has been sent to you.");
    }
}
