import org.testng.annotations.Test;

public class LoginTest extends MainTest {

    private String login = "contact@gmail.com";
    private String password = "Mentor001";


    private String login_1 = MainTest.credentials[0];
    private String password_1 = MainTest.credentials[1];



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
