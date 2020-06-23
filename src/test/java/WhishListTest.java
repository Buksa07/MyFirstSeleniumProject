import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishListTest {

        public void WIshListTest(){
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("#header-account > div > ul > li:nth-child(2) > a");
        }

        public void navigate(){
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
            driver.findElement(By.cssSelector("#product-collection-image-423")).click();
            driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
            driver.quit();
        }

}
