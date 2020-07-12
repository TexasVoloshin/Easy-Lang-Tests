import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private final String login = "contact@gmail.com";
    private final String password = "Mentor001";
    private final String login_1 = BaseTest.credentials[0];
    private final String password_1 = BaseTest.credentials[1];

    @Test
    public void shouldNotLogin() {
        indexPage.openIndexPage()
                 .openLoginPage()
                 .setLogin(login)
                 .setPassword(password)
                 .clickLoginButton()
                .loginAssertion.isUserNotLoggedIn();
    }

    @Test
    public void shouldLogin() {

        indexPage.openIndexPage()
                 .openLoginPage()
                 .setLogin(login_1)
                 .setPassword(password_1)
                 .clickLoginButton()
                .loginAssertion.isUserLoggedIn();
    }

}
