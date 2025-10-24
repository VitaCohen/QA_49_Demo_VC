package ajaxs_tests;

import ajaxs_element.Primer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimerAjax {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void ajaxTestUI(){
        Primer primer = new Primer(getDriver());
        primer.methodAjax();
    }

    @Test
    public void testUI(){
        Primer primer = new Primer(getDriver());
        primer.method();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
