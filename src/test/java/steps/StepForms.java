package steps;

import com.microsoft.playwright.Page;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.pageForms;

public class StepForms {
    pageForms pageForms = new pageForms(Hooks.page);
    @Given("go site demo {string}")
    public void go_site_demo(String string) {
        pageForms.open(string);
    }
    @When("input the details {string} {string} {string} {string} {string}")
    public void input_the_details(String string, String string2, String string3, String string4, String string5) {
        pageForms.formsfills(string,string2,string3,string4,string5);
    }
    @Then("verify that some all information is correct")
    public void verify_that_some_all_information_is_correct() {
        pageForms.submit();
        System.out.println("Test OK ");
    }
}
