import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
         driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void loginInvalid(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        WebElement accountElement = driver.findElement(By.cssSelector("#header-account > div > ul > li.first > a"));
        Assert.assertEquals("My Account", accountElement.getText());
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        WebElement loginElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > div > h1"));
        Assert.assertEquals("LOGIN OR CREATE AN ACCOUNT", loginElement.getText());
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement erorElement = driver.findElement(By.cssSelector("#advice-validate-password-pass"));
        Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.",erorElement.getText());

    }
    @Test
    public void loginValid(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement validElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertEquals("Hello, Buksa Ionut Paul!", validElement.getText());

    }
    @Test
    public void loginInvalidCaracters(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksayaho.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1@57Nioi");
        driver.findElement(By.cssSelector("#send2")).click();
      //  WebElement charactersElement = driver.findElement(By.cssSelector("#advice-validate-password-pass"));

    }
    @Test
    public void invalidPassLogin(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("@");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement invalidPassElement = driver.findElement(By.cssSelector("#advice-validate-password-pass"));
        Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.",invalidPassElement.getText());
    }
    @After
    public void exit(){
        driver.quit();
    }
}
