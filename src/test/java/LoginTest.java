import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
    public void login2(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
    public void login3(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("ionut.buksayaho.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1234567");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
}
