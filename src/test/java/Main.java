import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WhishListTest whishListTest = new WhishListTest();
        whishListTest.navigate();

        RegisterTest registerTest = new RegisterTest();
        registerTest.register();

        LoginTest loginTest = new LoginTest();
        loginTest.login();
        loginTest.login2();
        loginTest.login3();


    }


}
