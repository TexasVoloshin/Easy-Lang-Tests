import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private final String login = "contact@gmail.com";
    private final String password = "Mentor001";
    private final String login_1 = BaseTest.credentials[0];
    private final String password_1 = BaseTest.credentials[1];


    @Story("Story name: Check Login page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify logging is not complete when credentials are incorrect")
    @Test(priority = 1, description = "verifying login with incorrect credentials test")
    public void shouldNotLogin() {
        indexPage.openIndexPage()
                 .openLoginPage()
                 .setLogin(login)
                 .setPassword(password)
                 .clickLoginButton()
                .loginAssertion.isUserNotLoggedIn();
    }

    @Story("Story name: Check Login page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify login page function test on Login Page")
    @Test(priority = 2, description = "verifying login test")
    public void shouldLogin() {

        indexPage.openIndexPage()
                 .openLoginPage()
                 .setLogin(login_1)
                 .setPassword(password_1)
                 .clickLoginButton()
                .loginAssertion.isUserLoggedIn();
    }

}
