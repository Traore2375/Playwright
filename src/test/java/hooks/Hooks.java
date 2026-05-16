package hooks;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ExcelUtils;

public class Hooks {

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    @Before
    public void setUp() throws Exception {

        // Excel setup
        String dossier = System.getProperty("user.dir");
        String path = dossier + "/src/test/resources/data/Testdata.xlsx";

        System.out.println("Le chemin est : " + path);

        ExcelUtils.setExcelFile(path, "data");

        // Playwright init
        playwright = Playwright.create();

        // Browser launch
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setSlowMo(400)
        );

        // Context creation
        context = browser.newContext(
                new Browser.NewContextOptions()
                        .setViewportSize(1920, 1080)
        );

        // Start tracing
        context.tracing().start(
                new Tracing.StartOptions()
                        .setScreenshots(true)
                        .setSnapshots(true)
                        .setSources(true)
        );

        // Create page
        page = context.newPage();

        // URL config
        String url = ConfigLoader.get("base.url");

        if (url == null || url.isEmpty()) {
            url = "https://demoqa.com";
        }

        // Navigate
        page.navigate(url);

        System.out.println("Browser started successfully");
    }

    @After
    public void tearDown() {

        try {
            // Save trace file
            if (context != null) {
                context.tracing().stop(
                        new Tracing.StopOptions()
                                .setPath(java.nio.file.Paths.get("trace.zip"))
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Proper closing order
        if (page != null) {
            page.close();
        }

        if (context != null) {
            context.close();
        }

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }

        System.out.println("Browser closed");
    }
}