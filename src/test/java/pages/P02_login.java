package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P02_login {
    public static void click_login_tab()
    {
        driver.findElement(By.className("ico-login")).click();

    }
    public static void click_LOGIN_button()
    {
        driver.findElement(By.className("button-1")).click();
    }

}
