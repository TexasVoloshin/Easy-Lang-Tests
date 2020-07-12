import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test
    public void shouldShowContacts() {
        indexPage.openIndexPage()
                 .openContactPage().contactEmailIsDisplayed();
    }
}
