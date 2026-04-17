package steps;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.TextBoxPage;

import static hooks.Hooks.browser;
import static hooks.Hooks.playwright;

public class StepTextbox {

    TextBoxPage textBoxPage = new TextBoxPage(Hooks.page);
    @Given("go to site  and textbox section {string}")
    public void go_to_site_and_textbox_section(String string) {
        textBoxPage.open(string);
    }

    @When("the page textbox displayed fill the {string} and {string} and {string} and {string}")
    public void the_page_textbox_displayed_fill_the_and_and_and(String string, String string2, String string3, String string4) {
        textBoxPage.fillForm(string,string2,string3,string4);
        textBoxPage.submit();
    }
}
