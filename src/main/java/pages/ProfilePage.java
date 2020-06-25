package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePage extends MainPage {


    @FindBy(xpath = "//h1")
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

    public void replaysIsDisplayedInH1andButton() {
        System.out.println(replays.getText());
        String tekst = replays.getText();
        int lenght = tekst.length();
        System.out.println(tekst.charAt(lenght - 1));
        int NumberPowtorki = Character.getNumericValue(tekst.charAt(lenght - 1));
        int numberOfReplyFromButton = Integer.parseInt(driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-profile/app-repeat/div/div/div[2]/div[1]/div[2]/a")).getText());
        Assert.assertEquals(numberOfReplyFromButton, NumberPowtorki);
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-profile/app-repeat/div/div/div[2]/div[1]/div[2]/a")).getText());

    }

    public void OneReplyShouldBeAdded() {
        int initNumberOfReply = Integer.parseInt(driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-profile/app-repeat/div/div/div[2]/div[1]/div[2]/a")).getText());


    }
}
