package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.BasePage;

public class LoginAssertion extends BasePage {
    // with  incorrect credentails
    @FindBy(xpath = "//span[@class='is- help is-danger is-size-5']")
    private WebElement wrongCredentials;

  // with correct credentails
  @FindBy(xpath="//a[@class='button green-btn' and contains(text(), 'Wyloguj')]")
    private WebElement correctCredentials;


    public LoginAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void isUserNotLoggedIn() {
        Assert.assertTrue(wrongCredentials.isDisplayed());

    }

    public void isUserLoggedIn() {
        Assert.assertTrue(correctCredentials.isDisplayed());

    }

}
