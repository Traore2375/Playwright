package hooks;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setUp() {
        String url = ConfigLoader.get("base.url");

        page.navigate(url);
        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200)
        );

        page = browser.newPage();


        page.navigate("https://demoqa.com");

        System.out.println("Browser started");
    }
    @After
    public void teardown(){
        page.close();
    }

}