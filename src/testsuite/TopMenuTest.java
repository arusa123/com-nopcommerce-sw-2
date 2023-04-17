package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    //browser
    @Before
    public void setUp() {
        openBrowser("Chrome");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        driver.findElement(By.linkText("Computers")).click();
        //actual text
       String actualText= driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title","Computers",actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.linkText("Electronics")).click();
        //actual text
        String actualText= driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title","Electronics",actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click();
        //actual text
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title", "Apparel", actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.linkText("Digital downloads")).click();
        //actual text
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title", "Digital downloads", actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.linkText("Books")).click();
        //actual text
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title", "Books", actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.linkText("Jewelry")).click();
        //actual text
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title", "Jewelry", actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("Gift Cards")).click();
        //actual text
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        Assert.assertEquals("Page title", "Gift Cards", actualText);
    }
    //closing browser
   @After
    public void closeDown(){
        closeBrowser();
   }

}
