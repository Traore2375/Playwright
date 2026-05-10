package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PageUpload;

public class StepsUpload {

    PageUpload pageUpload = new PageUpload(Hooks.page);
    @Given("the user opens the upload download page {string}")
    public void the_user_opens_the_upload_download_page(String string) {
      pageUpload.openurl(string);
    }
    @When("the user downloads the sample file")
    public void the_user_downloads_the_sample_file() {
     pageUpload.downloadfile();
    }
    @When("the user uploads the downloaded file")
    public void the_user_uploads_the_downloaded_file() {
        pageUpload.choosefile();
    }
    @Then("the file should be imported successfully")
    public void the_file_should_be_imported_successfully() {
        pageUpload.checkfileimported();
    }
}
