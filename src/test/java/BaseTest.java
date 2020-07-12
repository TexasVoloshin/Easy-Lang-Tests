import config.ReadFileData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import pages.*;

public class BaseTest {
    public static String[] credentials;
    public WebDriver driver;
    IndexPage indexPage;
    LoginPage loginPage;
    ContactPage contactPage;
    AccountPage accountPage;
    ProfilePage profilePage;
    private String url;
    ReadFileData ReaderFileData = new ReadFileData();


    public BaseTest() {
        this.credentials = ReaderFileData.ReadValidCredentials();

    }

    @Parameters({"browser", "url"})
    @BeforeClass
    // @BeforeGroups(groups = "loggedin")
    // Passing Browser parameter from TestNG xml
    public void beforeTest(String browser, String url) throws Exception {

        // If the browser is Firefox, then do this
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:/Selenium/geckodriver.exe");
            driver = new FirefoxDriver();

            // If browser is IE, then do this

        } else if (browser.equalsIgnoreCase("ie")) {

            // Here I am setting up the path for my IEDriver
            System.setProperty("webdriver.ie.driver", "D:/Selenium/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {

            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }

        this.url = url;
        driver.manage().window().maximize();
        indexPage = new IndexPage(driver, url);
        // loginPage = new LoginPage(driver);
        // accountPage = new AccountPage(driver);

    }

    //
    // @BeforeClass()
 /*   public void userIsLoggedIn(String validLogin, String validPassword ){
        validLogin=this.credentials[0];
        validPassword=this.credentials[1];

        indexPage.openLoginPage().setLogin(validLogin).setPassword(validPassword)
                .clickLoginButton().loginAssertion.isUserNotLoggedIn();

    }*/
    @AfterTest
    public void after() {
        driver.close();

    }

    public String getUrl() {
        return url;
    }
}
