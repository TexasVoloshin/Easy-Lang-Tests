package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage extends MainPage {


  @FindBy(xpath = "//h1[contains(text(), 'A Powtórki: 0 ')]")
   private WebElement replays;

   @FindBy(xpath = "//p[contains(@class,'notifier__notification-message') and contains(text(),'Tylko dla zalogowanych!')]")
   private WebElement noteForLogged;

    public ProfilePage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver, this);

        // caltchAssertion = new caltchAssertion(driver);
    }
    public void notificationIsDisplayed() {

        Assert.assertTrue(noteForLogged.isDisplayed());

    }

   public void replaysIsDisplayed() {

        Assert.assertTrue(replays.isDisplayed());

    }
}
