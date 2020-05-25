import org.testng.annotations.Test;

public class LoginTest extends MainTest {

    private String login = "contact@gmail.com";
    private String password = "Mentor001";


    private String login1 = "erasmus.mentor.contact@gmail.com";
    private String password1 = "Mentor00";

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

    @Test
    public void shouldLogin() {
        indexPage.openIndexPage()
                .openLoginPage()
                .setLogin(login1)
                .setPassword(password1)
                .clickLoginButton()

                .loginAssertion.isUserLoggedIn();


        //.isUserNotLoggedIn();
    }

}
