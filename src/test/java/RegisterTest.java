import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void registerAcounntExisting(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        WebElement createElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > div > h1"));
        Assert.assertEquals("CREATE AN ACCOUNT",createElement.getText());
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Buksa");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Ionut");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Paul");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement registerElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span"));
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", registerElement.getText());
    }
    @Test
    public void registerInvalid(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Buksa");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Ionut");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Paul");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement invalidElement = driver.findElement(By.cssSelector("#advice-validate-password-password"));
        Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.", invalidElement.getText());
    }
    @After
    public void exit(){
      //  driver.quit();
    }
}
