package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.pageTables;

public class StepTables {
    pageTables pageTables = new pageTables(Hooks.page);
    @Given("go to webtable {string}")
    public void go_to_webtable(String string) {
        pageTables.open(string);
    }
    @When("I enter {string} {string} {string} {string} {string} {string}")
    public void i_enter(String string, String string2, String string3, String string4, String string5, String string6) {
        pageTables.filltable(string,string2,string3,string4,string5,string6);
    }
    @When("click submit button")
    public void click_submit_button() {
       pageTables.submit();
    }
    @Then("verify the details of table")
    public void verify_the_details_of_table() {
        System.out.println("TEST OKKK");
    }

}
