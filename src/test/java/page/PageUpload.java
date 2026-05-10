package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

import java.nio.file.Paths;

public class PageUpload {

    private Page page;

    public PageUpload(Page page) {
        this.page = page;
    }
   private Locator btndownload(){
        return page.locator("#downloadButton");
   }

   private Locator btnchoosefile(){
        return page.locator("#uploadFile");
   }

   private Locator btnfileimported(){
        return page.locator("#uploadedFilePath");
   }

   public void downloadfile(){
        btndownload().click();
   }

   public void choosefile(){
        btnchoosefile().setInputFiles(Paths.get("C:\\Users\\TRAORE\\Downloads\\sampleFile (95).jpeg"));
   }

   public void checkfileimported(){
       PlaywrightAssertions.assertThat(btnfileimported()).containsText("C:\\fakepath\\sampleFile (95).jpeg");
   }

   public void openurl(String url){
        page.navigate(url);
   }
}
