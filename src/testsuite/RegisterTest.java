package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    //setup browser
    @Before
    public void setUp() {
        openBrowser("Chrome");
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //navigate to register page
        driver.findElement(By.linkText("Register")).click();
       String actualElement = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Registration page","Register",actualElement);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //clicking on the register link
        driver.findElement(By.linkText("Register")).click();

        //Select gender radio button
        driver.findElement(By.id("gender-female")).click();

        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Prime");

        // enter last name
        driver.findElement(By.id("LastName")).sendKeys("Testing");

        //enter email id
        driver.findElement(By.id("Email")).sendKeys("prime1343@gmail.com");

        //set password
        driver.findElement(By.id("Password")).sendKeys("prime123");
        //confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("prime123");

        //Click on REGISTER button
        driver.findElement(By.name("register-button")).click();

        //verify the text
       String actualtext= driver.findElement(By.linkText("Your registration completed")).getText();
        Assert.assertEquals("Registered successfully","Your registration completed",actualtext);

    }
    public void teardo(){
        closeBrowser();
    }


}