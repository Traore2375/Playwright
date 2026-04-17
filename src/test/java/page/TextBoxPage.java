package page;

import com.microsoft.playwright.*;

public class TextBoxPage {

    private final Page page;

    // Constructor
    public TextBoxPage(Page page) {
        this.page = page;
    }

    // Locators
    private Locator fullName() {
        return page.locator("#userName");
    }

    private Locator email() {
        return page.locator("#userEmail");
    }

    private Locator currentAddress() {
        return page.locator("#currentAddress");
    }

    private Locator permanentAddress() {
        return page.locator("#permanentAddress");
    }

    private Locator submitBtn() {
        return page.locator("#submit");
    }

    // Actions
    public void open(String url) {
        page.navigate(url);
    }

    public void fillForm(String name, String mail, String current, String permanent) {
        fullName().fill(name);
        email().fill(mail);
        currentAddress().fill(current);
        permanentAddress().fill(permanent);
    }

    public void submit() {
        submitBtn().click();
    }
}