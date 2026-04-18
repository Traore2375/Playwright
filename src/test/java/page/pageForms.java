package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import org.testng.Assert;

import java.nio.file.Paths;

public class pageForms {
    private Page page;
    public pageForms(Page page) {
        this.page=page;
    }

    // Locators
    private Locator btnmenuforms(){
        return page.getByText("Practice Form");
    }
    private  Locator txtfirstname(){
        return page.locator("#firstName");
    }
    private  Locator txtlasttname(){
        return page.locator("#lastName");
    }
    private  Locator txtmail(){
        return page.locator("#userEmail");
    }
    private  Locator btnradiosexe(){
        return page.locator("#gender-radio-1");
    }
    private  Locator txtnumber(){
        return page.locator("#userNumber");
    }
    private  Locator btnsubmit(){
        return page.locator("#submit");
    }
    private  Locator txtcurrentAdress(){
        return page.locator("#currentAddress");
    }

    private  Locator btnState(){
        return page.locator("#state");
    }
    private  Locator btnCity(){
        return page.locator("#city");
    }


    //Actions

    public void formsfills(String first, String last, String email, String number, String text){
         txtfirstname().fill(first);
         txtlasttname().fill(last);
         txtmail().fill(email);
         txtnumber().fill(number);
         btnradiosexe().click();
         txtcurrentAdress().fill(text);
        // State
        page.locator("#state").click();
        page.locator("#state").locator("input").fill("NCR");
        page.getByRole(AriaRole.OPTION,
                new Page.GetByRoleOptions().setName("NCR")
        ).click();

        page.locator("#city").click();
        page.locator("#city").locator("input").fill("Delhi");
        page.getByRole(AriaRole.OPTION,
                new Page.GetByRoleOptions().setName("Delhi")
        ).click();


    }
    public void uploadFile(String path) {

        page.setInputFiles("#uploadPicture", Paths.get(path));
    }
    public void open(String url){
        page.navigate(url);
        btnmenuforms().click();
    }
    public void submit(){
        btnsubmit().click();
    }
    // Assertions (IMPORTANT FIX)
  public void checkdata(){

      String expectedmsg = page.locator("#example-modal-sizes-title-lg").innerText();
      String actualMsg="Thanks for submitting the form";
      Assert.assertEquals(expectedmsg, actualMsg);
  }
}
