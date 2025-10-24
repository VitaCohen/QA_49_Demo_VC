package ajaxs_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Primer extends BasePage {
    public Primer(WebDriver driver) {
        setDriver(driver);
        driver.get("https://telranedu.web.app/home");
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);

    }

    @FindBy(xpath = "//*[text() = 'LOGIN']")
    WebElement btnLoginAjax;

    @FindBy(xpath = "//input[@name = 'email']")
    WebElement inputEmailAjax;


    public void methodAjax() {
        btnLoginAjax.click();
        inputEmailAjax.sendKeys("ajax@m.com");
    }

    public void method() {
        WebElement btnLogin = driver
                .findElement(By.xpath("//*[text() = 'LOGIN']"));
        btnLogin.click();
        WebElement inputEmail = driver
                .findElement(By.xpath("//input[@name = 'email']"));

        inputEmail.sendKeys("dsjdjkasdjsd");
    }

}
