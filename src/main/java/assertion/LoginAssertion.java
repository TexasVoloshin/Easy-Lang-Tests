package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.MainPage;

public class LoginAssertion extends MainPage {

    @FindBy(xpath = "//span[@class='is- help is-danger is-size-5']")
    private WebElement wrongCredentials;


    public LoginAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void isUserNotLoggedIn() {
        Assert.assertTrue(wrongCredentials.isDisplayed());

    }
}
