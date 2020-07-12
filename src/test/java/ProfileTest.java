import org.testng.annotations.Test;

public class ProfileTest extends BaseTest {
    private String login_1 = BaseTest.credentials[0];
    private String password_1 = BaseTest.credentials[1];

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
        indexPage.openIndexPage().openProfilePage().replaysIsDisplayedInH1andButton();
    }
}
