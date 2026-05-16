package steps;

import com.microsoft.playwright.assertions.PlaywrightAssertions;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PageSelectedOptions;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class StepsSelectOptions {
    PageSelectedOptions pageSelectedOptions = new PageSelectedOptions(Hooks.page);
    @Given("I navigate to {string}")
    public void i_navigate_to(String string) {
        pageSelectedOptions.open(string);
    }
    @When("I select {string} from the group select dropdown")
    public void i_select_from_the_group_select_dropdown(String string) {
        pageSelectedOptions.valueone();
    }
    @When("I select {string} from the select one dropdown")
    public void i_select_from_the_select_one_dropdown(String string) {
      pageSelectedOptions.zoneselecttitle();
    }
    @When("I select {string} from the old style select menu")
    public void i_select_from_the_old_style_select_menu(String string) {
       pageSelectedOptions.selectred();
    }
    @When("I select the following colors in the multi-select dropdown")
    public void i_select_the_following_colors_in_the_multi_select_dropdown() {
        pageSelectedOptions.selectmultiple();
    }
    @When("I select {string} from the standard multi-select")
    public void i_select_from_the_standard_multi_select(String string) {
        pageSelectedOptions.carselected(string);
    }
    @Then("all selected values should be displayed correctly")
    public void all_selected_values_should_be_displayed_correctly() {
       pageSelectedOptions.checkedalltest();
    }
}
