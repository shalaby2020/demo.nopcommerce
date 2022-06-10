package pages;
import org.openqa.selenium.By;

import static stepDefinitions.Hooks.driver;

public class P01_register {
    static String fisrtname = "shalaby" ;
    static String lasttname = "ahmed" ;
    static String password = "aero2020" ;
    static String confirmpassword = "aero2020";
    static String companyname = "autocompany";
    static String enterEmail = "automation@gmail.com";
    static String day = "21" ;
    static String month = "3" ;
    static String year =  "1997";
    static String Gender = "gender-male";
    static String Button = "register-button";

    public static void fisrt_name ()
    {
        driver.findElement(By.id("FirstName")).sendKeys(fisrtname);

    }
    public static void last_name ()
    {
        driver.findElement(By.id("LastName")).sendKeys(lasttname);

    }
    public static void password ()
    {
        driver.findElement(By.id("Password")).sendKeys(password);
    }
    public static void confirmpassword ()
    {
        driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
    }
    public static void companyname ()
    {
        driver.findElement(By.id("Company")).sendKeys(companyname);
    }
    public static void enterEmail() {
        driver.findElement(By.id("Email")).sendKeys(enterEmail);
    }
    public static void select_day()
    {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys(day);
    }
    public static void select_month()
    {
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys(month);
    }
    public static void select_year()
    {
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys(year);

    }
    public static void Click_on_any_Gender_Option()
    {
        driver.findElement(By.id(Gender)).click();
    }
    public static void clickREGISTERButton() {
        driver.findElement(By.id(Button)).click();
    }

}
