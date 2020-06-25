package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ContactPage extends MainPage {

    @FindBy(xpath = "//input[@id='recaptcha-token']")
    private WebElement captchaCheckBox;
    @FindBy(xpath = "//div[contains(@class,'subtitle') and contains(text(),' Ochrona przeciwspamowa. ')]")
    private WebElement conatctEmail;

    public ContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public ContactPage clickIamNotRobotButton() {
        //  WebElement iFrame = driver.findElement(By.cssSelector("div#recaptcha-checkbox-border"));

/*
        driver.switchTo().frame(iFrame);
        driver.switchTo().parentFrame();    // to move back to parent frame
        driver.switchTo().defaultContent(); // to move back to most parent or main frame*/
   /*     Actions builder = new Actions(driver);
        builder.moveToElement(captchaCheckBox, 0, 0).click().build().perform();*/
        // new Actions(driver).moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath( "//input[@id='recaptcha-token']" )))).build().perform();

        //new Actions(driver).moveToElement(captchaCheckBox).click().build().perform();

        //    captchaCheckBox.click();
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ContactPage(driver);
    }*/
        return new ContactPage(driver);
    }

    public void contactemailIsDisplayed() {

        Assert.assertTrue(conatctEmail.isDisplayed());

    }

}
