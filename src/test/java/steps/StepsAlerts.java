package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PageAlerts;

public class StepsAlerts {
    PageAlerts pageAlerts = new PageAlerts(Hooks.page);
    @Given("go to page alert {string}")
    public void go_to_page_alert(String string) {
        pageAlerts.open(string);
    }
    @When("click the first button")
    public void click_the_first_button() {
       pageAlerts.alerts1();
    }
    @Then("the message display")
    public void the_message_display() {
        System.out.println("TEST OK");
    }

    @When("click the second button")
    public void click_the_second_button() {
        pageAlerts.alerts2();
    }
    @Then("the message display after {int} second And   click button OK")
    public void the_message_display_after_second_and_click_button_ok(Integer int1) {
        System.out.println("test 2");
    }


    @When("click the thirst button")
    public void click_the_thirst_button() {
        pageAlerts.alerts3();
    }
    @Then("the popup display")
    public void the_popup_display() {
        System.out.println("test 3");

    }

    @When("click the fourth button")
    public void click_the_fourth_button() {
        pageAlerts.alerts4();
    }
    @Then("the popup displayed")
    public void the_popup_displayed() {
        System.out.println("TEST 4");
    }


}
