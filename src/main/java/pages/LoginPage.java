package pages;

import assertion.LoginAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends MainPage {
    public LoginAssertion loginAssertion;


    @FindBy(xpath = "//input[@type= 'email']")
    private WebElement userNameInput;

    @FindBy(xpath =  "//input[@type= 'password']")
    private WebElement userPasswordInput;

    @FindBy(how= How.XPATH, using="//button[text()='Zaloguj się']")
    private  WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        loginAssertion = new LoginAssertion(driver);
    }

    public LoginPage setLogin(String login) {
        userNameInput.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        userPasswordInput.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }
}
