package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

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

    //Actions

    public void formsfills(String first, String last, String email, String number, String text){
         txtfirstname().fill(first);
         txtlasttname().fill(last);
         txtmail().fill(email);
         txtnumber().fill(number);
         btnradiosexe().click();
         txtcurrentAdress().fill(text);

    }
    public void open(String url){
        page.navigate(url);
        btnmenuforms().click();
    }
    public void submit(){
        btnsubmit().click();
    }
    // Assertions (IMPORTANT FIX)

}
