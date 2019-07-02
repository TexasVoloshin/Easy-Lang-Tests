package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends MainPage {

    @FindBy(css = "[href=\"/identity/account/login\"]")
    private WebElement goToLoginPage;


    public IndexPage(WebDriver driver, String url) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.url = url;
    }

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public IndexPage openIndexPage() {
        driver.get(url);
        waitForJStoLoad();
        return this;
    }

    public LoginPage openLoginPage() {
        goToLoginPage.click();
        return new LoginPage(driver);
    }
}
