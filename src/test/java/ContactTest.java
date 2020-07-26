import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {
    @Story("Story name: Check Contact page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description: Verify if Contact page is displayed")
    @Test(priority = 1, description = "verifying displaying of contacts")
    public void shouldShowContacts() {
        indexPage.openIndexPage()
                 .openContactPage().contactEmailIsDisplayed();
    }
}
