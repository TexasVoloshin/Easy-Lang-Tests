import org.testng.annotations.Test;

public class ContactTest extends MainTest {

    @Test
    public void shouldShowContacts() {
        indexPage.openIndexPage()
                .openContactPage().contactemailIsDisplayed();

    }

}
