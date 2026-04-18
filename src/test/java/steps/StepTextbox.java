package steps;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.TextBoxPage;
import utils.ExcelUtils;

import static hooks.Hooks.browser;
import static hooks.Hooks.playwright;

public class StepTextbox {

    ExcelUtils excelUtils = new ExcelUtils();

    TextBoxPage textBoxPage = new TextBoxPage(Hooks.page);
    @Given("go to site  and textbox section {string}")
    public void go_to_site_and_textbox_section(String string) {
        textBoxPage.open(string);
    }

    @When("the page textbox displayed fill the {string} and {string} and {string} and {string}")
    public void the_page_textbox_displayed_fill_the_and_and_and(String string, String string2, String string3, String string4) throws Exception {
       // textBoxPage.fillForm(string,string2,string3,string4);
        String firstname = ExcelUtils.getCellData(2,0);
        String lastname = ExcelUtils.getCellData(2,1);
        String email = ExcelUtils.getCellData(2,3);
        String number = ExcelUtils.getCellData(2,6);
        textBoxPage.fillForm(firstname,lastname,email,number);

        textBoxPage.submit();
    }
}
