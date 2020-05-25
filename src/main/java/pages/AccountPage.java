package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends LoginPage {
    //public LoginAssertion loginAssertion;

    public AccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        //loginAssertion = new LoginAssertion(driver);
    }

}
