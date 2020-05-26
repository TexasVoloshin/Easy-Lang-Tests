import config.ReadFileData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.AccountPage;
import pages.IndexPage;
import pages.LoginPage;

public class MainTest {
    public static String[] credentials;
    WebDriver driver;
    IndexPage indexPage;
    LoginPage loginPage;
    AccountPage accountPage;
    private String url;
    ReadFileData ReaderFileData = new ReadFileData();



    public MainTest() {
        this.credentials = ReaderFileData.ReadValidCredentials();
    }

    //String username;

    @BeforeTest
    @Parameters({"url"})
    public void before(String url) {

        System.setProperty("webdriver.gecko.driver","D:/Selenium/geckodriver.exe") ;
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
        this.url = url;
        driver = new FirefoxDriver();
        indexPage = new IndexPage(driver, url);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);


    }

    @AfterTest
    public void after() {
        driver.close();

    }

    public String getUrl() {
        return url;
    }
}
