package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class PageModals {


    private Page page ;

    public PageModals(Page page) {
        this.page = page;
    }

    private Locator btnsmallModal(){
        return page.locator("#showSmallModal");
    }
    private Locator popupsmallmodal(){
        return page.locator(".modal-body");
    }
    private  Locator btnclosesmall(){
        return page.locator("#closeSmallModal");
    }
    private Locator btnlargeModal(){
        return page.locator("#showLargeModal");
    }
   private Locator btncloselargemodal(){
        return page.locator("#closeLargeModal");
   }

   public void smallModal(){
        btnsmallModal().click();
       PlaywrightAssertions.assertThat(popupsmallmodal()).containsText("This is a small modal. It has very less content");
       btnclosesmall().click();
   }

   public void largeModal(){
        btnlargeModal().click();
        btncloselargemodal();
   }

   public void openurl(String url){
        page.navigate(url);
   }
}
