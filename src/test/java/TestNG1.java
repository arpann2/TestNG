import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by arpan on 26/02/2017.
 */
public class TestNG1 {
    String firefoxPath = "E:\\JARs\\Selenium-3.0.1\\geckodriver-v0.11.1-win64\\geckodriver.exe";
    WebDriver driver;

        @BeforeMethod
        public void init() {
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver = new FirefoxDriver();
        }

        @Test
        public void openBrowser(){
            driver.get("http:/www.bbc.com");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }


}
