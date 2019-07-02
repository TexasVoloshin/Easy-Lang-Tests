import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.AccountPage;
import pages.IndexPage;
import pages.LoginPage;

import java.util.Random;

public class MainTest {
    WebDriver driver;
    IndexPage indexPage;
    LoginPage loginPage;
    AccountPage accountPage;

    //String username;

    @BeforeTest
    @Parameters({"url"})
    public void before(String url) {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver, url);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
//
//        Random rg = new Random();
//        int randomInt = rg.nextInt(1000);
//        username = "username" + randomInt;
    }

    @AfterTest
    public void after() {
        driver.close();

    }

}
