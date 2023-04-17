package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Before
    public void setUp() {
        openBrowser("Chrome");
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //login element
        driver.findElement(By.linkText("Log in")).click();

        // expected element
        String expectedElement = "Welcome, Please Sign In!";

        //actual text element
        String actualElement = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals("Page Title", expectedElement, actualElement);



    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //login element
        driver.findElement(By.linkText("Log in")).click();

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime12@gmail.com");

        // enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("prime123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        // expected element
        String expectedResult = "Log out";

        // getting actual text
        String actualElement = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals("Log out link", expectedResult, actualElement);

    }

    @Test
    public void verifyTheErrorMessage() {
        //login element
        driver.findElement(By.linkText("Log in")).click();

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime@gmail.com");

        // enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("Prime12");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //expected text
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //actual text
        String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message", expectedText, actualText);

    }


    @After
    public void tearDown() {
          closeBrowser();
    }
}
