import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void register(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Buksa");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Ionut");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Paul");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ionut.buksa@yahoo.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("1234");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.quit();



    }
}
