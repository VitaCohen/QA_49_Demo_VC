package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class XpathSelectors {

    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsTextBox() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();
        pause(3000);

        WebElement inputFullName = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        inputFullName.sendKeys("Cat");

        WebElement inputEmail = driver.findElement(By.xpath("//form/div[@id='userEmail-wrapper']/div[2]/input"));
        inputEmail.sendKeys("cat@mail.com");

        WebElement labelText = driver.findElement(By.xpath("//*[text()='Current Address']"));
        System.out.println(labelText.getTagName());

        WebElement textareaCurAdd = driver.findElement(By.xpath("//*[text()='Current Address']/../..//textarea"));
        textareaCurAdd.sendKeys("gadhsgddgdygdy");

        WebElement textareaPerAdd = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//textarea"));
        textareaPerAdd.sendKeys("12454kljkjhjghgh");

        WebElement btnSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
        btnSubmit.click();

        WebElement outPut = driver.findElement(By.xpath("//*[@id='output']"));
        System.out.println(outPut.getText());
        pause(3000);
        driver.quit();



    }


    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideBanner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }

}
