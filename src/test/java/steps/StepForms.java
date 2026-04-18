package steps;

import com.microsoft.playwright.Page;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.pageForms;
import utils.ExcelUtils;

public class StepForms {
    pageForms pageForms = new pageForms(Hooks.page);
    @Given("go site demo {string}")
    public void go_site_demo(String string) {
        pageForms.open(string);
    }
    @When("input the details {string} {string} {string} {string} {string}")
    public void input_the_details(String string, String string2, String string3, String string4, String string5) {
        String firstname = ExcelUtils.getCellData(4,0);
        String lastname = ExcelUtils.getCellData(4,1);
        String email = ExcelUtils.getCellData(4,2);
        String number = ExcelUtils.getCellData(4,4);
        String dossier = System.getProperty("user.dir");
        String path = dossier +"/src/test/resources/data/Testdata.xlsx" ;
        pageForms.uploadFile(path);
        pageForms.formsfills(firstname,lastname,email,number,string5);
    }
    @Then("verify that some all information is correct")
    public void verify_that_some_all_information_is_correct() {
        pageForms.submit();
        pageForms.checkdata();
        System.out.println("Test OK ");

    }
}
