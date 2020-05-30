import org.testng.annotations.Test;

public class ProfileTest extends MainTest{
    private String login_1 = MainTest.credentials[0];
    private String password_1 = MainTest.credentials[1];

    @Test
    public void shouldNotShowProfilePageAndDisplayNotification() {
        indexPage.openIndexPage().openProfilePage().notificationIsDisplayed();

    }
    @Test
    public void shouldShowReplays() {
        indexPage.openIndexPage()
                .openLoginPage()
                .setLogin(login_1)
                .setPassword(password_1)
                .clickLoginButton()
                .loginAssertion.isUserLoggedIn();
        indexPage.openIndexPage().openProfilePage().replaysIsDisplayed();


    }}
