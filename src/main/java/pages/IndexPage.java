package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {

    @FindBy(css = "a[href='./login']")
    private WebElement goToLoginPage;
    @FindBy(css = "a[href='./contact']")
    private WebElement goToContactPage;
    @FindBy(css = "*[class*='navbar-item goto-repeat']")
    private WebElement goToProfilePage;

    public IndexPage(WebDriver driver, String url) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.url = url;
    }

    public IndexPage openIndexPage() {
        driver.get(url);
        waitForJSToLoad();
        return this;
    }

    public LoginPage openLoginPage() {
        driver.get(url + "/login");
        waitForJSToLoad();
        goToLoginPage.click();

        return new LoginPage(driver);
    }

    public ContactPage openContactPage() {
        waitForJSToLoad();
        driver.get(url + "/contact");
        return new ContactPage(driver);
    }

    public ProfilePage openProfilePage() {
        waitForJSToLoad();
        driver.get(url + "/profile");
        goToProfilePage.click();
        return new ProfilePage(driver);
    }
}
