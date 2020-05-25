import org.testng.annotations.Parameters;
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

    }

 /*   public void initFramework(@Optional("src/test/resources/config.properties/") String configfile) {
        //method implementation here
    }*/
    @Parameters( {"correctusername","correctpassword"} )
    @Test
    public void shouldLogin(String login1, String password1) {

        indexPage.openIndexPage()
                .openLoginPage()
                .setLogin(login1)
                .setPassword(password1)
                .clickLoginButton()
                .loginAssertion.isUserLoggedIn();


        //.isUserNotLoggedIn();
    }

}
