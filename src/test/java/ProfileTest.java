import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest {
    private String login_1 = BaseTest.credentials[0];
    private String password_1 = BaseTest.credentials[1];

    @Story("Story name: Check Profile page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify if Profile page is not displayed when not logged in and notification is displayed")
    @Test(priority = 1, description = "verifying if notification is displayed when try to show profile page without logging in")
    public void shouldNotShowProfilePageAndDisplayNotification() {
        indexPage.openIndexPage().openProfilePage().notificationIsDisplayed();
    }

    @Story("Story name: Check Profile page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify  number  of replays when logged in")
    @Test(priority = 1, description = "verifying number of replays on profile page")
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
