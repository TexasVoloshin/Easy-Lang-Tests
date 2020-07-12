import config.ReadFileData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.IndexPage;

public class BaseTest {

    public static String[] credentials;

    protected WebDriver driver;

    private String url;
    protected IndexPage indexPage;

    public BaseTest() {
        this.credentials = ReadFileData.readValidCredentials();
    }

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeTest(String browser, String url) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:/Selenium/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "D:/Selenium/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else {
            throw new Exception("Unknown browser.");
        }

        this.url = url;
        driver.manage().window().maximize();
        indexPage = new IndexPage(driver, url);
    }

    @AfterTest
    public void after() {
        driver.close();
    }
}
