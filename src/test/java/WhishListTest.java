import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishListTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
    }
    @Test
        public void WIshListTest(){
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("#header-account > div > ul > li:nth-child(2) > a");
        }
    @Test
        public void buyFail(){
            driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
            driver.findElement(By.cssSelector("#product-collection-image-423")).click();
            driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
            WebElement buyElement = driver.findElement(By.cssSelector("#wishlist-view-form > div > p"));
        Assert.assertEquals("You have no items in your wishlist.", buyElement.getText());
        }
    @After
    public void exit(){
          driver.quit();
    }

}
