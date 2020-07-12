package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement replays;
    @FindBy(xpath = "//p[contains(@class,'notifier__notification-message') and contains(text(),'Tylko dla zalogowanych!')]")
    private WebElement noteForLogged;

    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void notificationIsDisplayed() {
        Assert.assertTrue(noteForLogged.isDisplayed());
    }

    public void replaysIsDisplayedInH1andButton() {
        var tekst = replays.getText();
        var lenght = tekst.length();
        var replayCount = Character.getNumericValue(tekst.charAt(lenght - 1));
        var numberOfReplyFromButton = Integer.parseInt(driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-profile/app-repeat/div/div/div[2]/div[1]/div[2]/a")).getText());
        Assert.assertEquals(numberOfReplyFromButton, replayCount);
    }
}
