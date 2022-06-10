package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.P01_register;
import pages.P02_login;

import static stepDefinitions.Hooks.driver;

public class D04_searchStepDef {

    @Given("navigate to the homepage")
    public void navigate_to_homepage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user log in to the application")
    public void userLogInToTheApplication() {
        P02_login.click_login_tab();
        P01_register.enterEmail();
        P01_register.password();
    }

    @When("click on text box search")
    public void clickOnTextBoxSearch()
    {
        driver.findElement(By.id("small-searchterms")).sendKeys("iphone");
        driver.findElement(By.className("button-1")).click();
    }

    @And("enter name of mobile")
    public void enterNameOfMobile() {
    }
}
