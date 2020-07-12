package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ContactPage extends BasePage {

    @FindBy(xpath = "//input[@id='recaptcha-token']")
    private WebElement captchaCheckBox;
    @FindBy(xpath = "//div[contains(@class,'subtitle') and contains(text(),' Ochrona przeciwspamowa. ')]")
    private WebElement contactEmail;

    public ContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void contactEmailIsDisplayed() {
        Assert.assertTrue(contactEmail.isDisplayed());
    }

}
