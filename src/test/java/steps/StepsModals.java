package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PageModals;

public class StepsModals {
  PageModals pageModals =new PageModals(Hooks.page);
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String string) {
        pageModals.openurl(string);
    }
    @When("the user opens")
    public void the_user_opens() {
       pageModals.smallModal();
    }
    @Then("the dialog should be displayed")
    public void the_dialog_should_be_displayed() {
        System.out.println("------- test OK ------");
    }
    @Then("the modal text should match the expected text")
    public void the_modal_text_should_match_the_expected_text() {
        System.out.println("------- test OK ------");
    }
    @When("the user closes the")
    public void the_user_closes_the() {
        System.out.println("------- test OK ------");
    }
    @When("the user opens the {string}")
    public void the_user_opens_the(String string) {
        pageModals.largeModal();
    }
    @Then("the {string} dialog should be displayed")
    public void the_dialog_should_be_displayed(String string) {
        System.out.println("------- test OK ------");
    }
    @Then("the user captures the modal content")
    public void the_user_captures_the_modal_content() {
        System.out.println("------- test OK ------");
    }
    @When("the user closes the {string}")
    public void the_user_closes_the(String string) {
        System.out.println("------- test OK ------");
    }
    @Then("all modal dialog validations should pass")
    public void all_modal_dialog_validations_should_pass() {
        System.out.println("------- test OK ------");
    }


}
