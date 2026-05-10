package hooks;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ExcelUtils;

public class Hooks {

    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setUp() throws Exception {


        String dossier = System.getProperty("user.dir");
        String path = dossier +"/src/test/resources/data/Testdata.xlsx" ;
        System.out.println(" le chemin est :"+path);
        ExcelUtils.setExcelFile(path, "data");
        // 1. Init Playwright
        playwright = Playwright.create();

        // 2. Launch browser
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setSlowMo(400)
        );

        // 3. Create context + page
        BrowserContext context = browser.newContext();
        page = context.newPage();


        // 4. Load config URL (option clean)
        String url = ConfigLoader.get("base.url");

        // fallback si null
        if (url == null) {
            url = "https://demoqa.com";
        }

        // 5. Navigate
        page.navigate(url);

        System.out.println("Browser started successfully");
    }

    @After
    public void teardown() {

        if (page != null) page.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();

        System.out.println("Browser closed");
    }
}