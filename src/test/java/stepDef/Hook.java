package stepDef;

import base.config;
import io.cucumber.java.Before;
import org.testng.util.Strings;


public class Hook extends config {
    public static String baseURL;
    public static String browserType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest() {
         driver= setupBrowser(browserType);
        if (Strings.isNullOrEmpty(envType)){
            envType = "QA";
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType = "chrome";
        }

        driver = setupBrowser(browserType);
        String url;
        switch (envType.toUpperCase()) {
            case "QA":
                url = "https://qa.taltektc.com";
                break;
            case "STAGE":
                url = "https://stage.taltektc.com";
                break;
            case "PROD":
                url = "https://prod.taltektc.com";
                break;
            default:
                throw new IllegalArgumentException("Invalid environment: " + envType);
        }
        driver.get(url);
    }
}
