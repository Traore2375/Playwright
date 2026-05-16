package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PageSelectedOptions {


    Page page;

    public PageSelectedOptions(Page page) {
        this.page = page;
    }

    private Locator zoneselectvalue(){
        return page.locator("#withOptGroup");
    }
    private Locator selectvalue(){
        return page.locator("#withOptGroup");
    }

   private  Locator zoneselectone(){
        return page.locator("#selectOne");
   }

    private Locator selectvalueone(){
        return page.getByLabel("Mr.");
    }
    private Locator selectoldvalue(){
        return page.locator("#oldSelectMenu");
    }
   private  Locator selectmultipleselect(){
        return page.locator("#react-select-4-input");
   }


   private Locator selectcar(){
        return page.locator("#cars");
   }
    public void open(String url ){
        page.navigate(url);
    }
 public void valueone(){
        zoneselectvalue().click();
     page.keyboard().type("Group 2, option 1");

     page.keyboard().press("Enter");


 }

 public void zoneselecttitle(){
        zoneselectone().click();

     page.keyboard().type("Mrs.");

     page.keyboard().press("Enter");
 }
 public void selectred(){
        selectoldvalue().selectOption("Green");
 }


 public void selectmultiple(){
        selectmultipleselect().click();
     page.keyboard().type("Green");

     page.keyboard().press("Enter");

     page.keyboard().type("Blue");

     page.keyboard().press("Enter");

     page.keyboard().type("Black");

     page.keyboard().press("Enter");
     page.keyboard().type("Red");

     page.keyboard().press("Enter");

 }

 public void carselected(String car){
        selectcar().selectOption(car);

 }

 public  void checkedalltest(){
     // Group select
     assertThat(selectvalue())
             .containsText("Group 2, option 1");

     // Select One
     assertThat(zoneselectone())
             .containsText("Mrs.");

     // Old Style Select
     assertThat(selectoldvalue())
             .hasValue("2");

     // Multi Select
     Locator multiSelect = page.locator(".css-1dyz3mf");

     assertThat(multiSelect).containsText("Red");
     assertThat(multiSelect).containsText("Blue");
     assertThat(multiSelect).containsText("Black");

     // Standard Multi Select
     assertThat(page.locator("#cars"))
             .hasValue("audi");
 }
}
