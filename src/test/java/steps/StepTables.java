package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.pageTables;
import utils.ExcelUtils;

public class StepTables {
    pageTables pageTables = new pageTables(Hooks.page);
    @Given("go to webtable {string}")
    public void go_to_webtable(String string) {
        pageTables.open(string);
    }
    @When("I enter {string} {string} {string} {string} {string} {string}")
    public void i_enter(String string, String string2, String string3, String string4, String string5, String string6) {

        String firstname = ExcelUtils.getCellData(3,0);
        String lastname = ExcelUtils.getCellData(3,1);
        String email = ExcelUtils.getCellData(3,2);
        String number = ExcelUtils.getCellData(3,4);
        pageTables.filltable(firstname,lastname,email,number,string5,string6);
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
