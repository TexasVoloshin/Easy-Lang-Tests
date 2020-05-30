import config.ReadFileData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.*;

public class MainTest {
    public static String[] credentials;
    public WebDriver driver;
    IndexPage indexPage;
    LoginPage loginPage;
    ContactPage contactPage;
    AccountPage accountPage;
    ProfilePage profilePage;
    private String url;
    ReadFileData ReaderFileData = new ReadFileData();

    public MainTest() {
        this.credentials = ReaderFileData.ReadValidCredentials();
    }
    @Parameters({"browser","url"})
    @BeforeTest
        // Passing Browser parameter from TestNG xml
    public void beforeTest(String browser, String url)throws Exception{
            // If the browser is Firefox, then do this


        if(browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver","D:/Selenium/geckodriver.exe");
                driver = new FirefoxDriver();

                // If browser is IE, then do this

            }else if (browser.equalsIgnoreCase("ie")) {

                // Here I am setting up the path for my IEDriver
                System.setProperty("webdriver.ie.driver", "D:/Selenium/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }else{
                //If no browser passed throw exception
                throw new Exception("Browser is not correct");
            }

        this.url = url;
        driver.manage().window().maximize();
        indexPage = new IndexPage(driver, url);
       // loginPage = new LoginPage(driver);
       // accountPage = new AccountPage(driver);

    }

    @AfterTest
    public void after() {
        driver.close();

    }

    public String getUrl() {
        return url;
    }
}
