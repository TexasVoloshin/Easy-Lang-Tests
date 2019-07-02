import org.testng.annotations.Test;

public class LoginTest extends MainTest {

    private String login = "pk@pk.pl";
    private String password = "Pk123456";

    @Test
    public void shouldNotLogin() {
        indexPage.openIndexPage()
                .openLoginPage()
                .setLogin(login)
                .setPassword(password)
                .clickLoginButton()
                .loginAssertion.isUserNotLoggedIn();

                //.isUserNotLoggedIn();
    }
}
