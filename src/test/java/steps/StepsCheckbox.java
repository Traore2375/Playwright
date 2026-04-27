package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PageCheckbox;

public class StepsCheckbox {

    PageCheckbox pageCheckbox = new PageCheckbox(Hooks.page);
    @Given("I navigate to {string} and open the checkbox section")
    public void i_navigate_to_and_open_the_checkbox_section(String string) {
        pageCheckbox.open(string);
    }
    @When("I click on the expand button and I select the {string} checkbox and I choose {string} and I choose {string}")
    public void i_click_on_the_expand_button_and_i_select_the_checkbox_and_i_choose_and_i_choose(String string, String string2, String string3) {
        pageCheckbox.Checkboxfucntion();
    }
    @Then("I should see the message {string}")
    public void i_should_see_the_message(String string) {
       pageCheckbox.verify(string);
    }
}
