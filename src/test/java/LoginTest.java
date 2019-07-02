import org.testng.annotations.Test;

public class LoginTest extends MainTest {

    private String login = "contact@gmail.com";
    private String password = "Mentor001";

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
