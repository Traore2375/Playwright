package page;

import com.microsoft.playwright.Dialog;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PageAlerts {

    private Page page;

    public PageAlerts(Page page) {
        this.page = page;
    }


    private Locator menualerts(){
        return page.getByText("Alerts");
    }

    private  Locator btnclickmefirst(){
        return page.locator("#alertButton");
    }

    private Locator btnclickmesecond(){
        return page.locator("#timerAlertButton");
    }

    private Locator btnclickmethirst(){
        return page.locator("#confirmButton");
    }

    private Locator btnclickmeforth(){
        return page.locator("#promtButton");
    }
    public void alerts2(){  btnclickmesecond().click();

        page.onDialog(dialog -> {
            if (dialog.type().equals("alert")) {
                dialog.accept();
            }
        });

    }
    public void alerts1(){
        //menualerts().click();
        btnclickmefirst().click();

        page.onDialog(dialog -> {
            dialog.accept(); // ou accept()
        });
        //assertThat(btnclickmefirst()).isChecked();
    }
  public void alerts3(){
      btnclickmethirst().click();
      page.onDialog(Dialog::dismiss);
      String actualmsg = page.locator("#confirmResult").innerText();
      String expectedmsg= "You selected Cancel";
      Assert.assertEquals(actualmsg,expectedmsg);

  }
  public void alerts4(){
      page.onceDialog(dialog -> dialog.accept("TEST PLAY"));

      btnclickmeforth().click();

      String actualmsg = page.locator("#promptResult").textContent();
      String expectedmsg = "You entered TEST PLAY";

      Assert.assertEquals(actualmsg, expectedmsg);
  }
    public void open(String url){
        page.navigate(url);
    }

    public void verify(){
        assertThat(menualerts()).isChecked();
    }
}
