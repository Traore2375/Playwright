package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PageCheckbox {

    private Page page;

    public PageCheckbox(Page page) {
        this.page = page;
    }

   public Locator btnplus(){
        return page.locator(".rc-tree-switcher.rc-tree-switcher_close").first();
   }

   public  Locator btnplusdesktop() {
       return page.locator(".rc-tree-switcher.rc-tree-switcher_close").first();
   }

   public Locator checkboxnotes(){
        return page.locator("[aria-label='Select Notes']");
   }

   public Locator btnplusworkspace(){
       return page.locator("[aria-label='Select Documents']");
   }


   public void Checkboxfucntion(){
        btnplus().click();
        btnplusdesktop().waitFor();
        btnplusdesktop().click();
        checkboxnotes().check();
        checkboxnotes().isChecked();


   }

   public void verify (String msg){
       String expected =msg;
       String actual= page.locator("#result").innerText();
  assertThat(page.locator("#result")).containsText(msg);
   }

   public void open(String url){
        page.navigate(url);
   }
}


