package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {

    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {
        driver.get("https://demoqa.com/");
        //driver.navigate().to("https://demoqa.com/");
        //driver.navigate().back();
        //driver.navigate().refresh();
        driver.manage().window().maximize();
        pause(4000);

        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getTagName());

        //WebElement divElements = driver.findElement(By.cssSelector("div[class='card-up']"));
        WebElement divElements = driver.findElement(By.cssSelector(".card-up"));
        divElements.click();
        pause(4000);

       // WebElement radioButton = driver.findElement(By.cssSelector("li[id='item-2']"));
        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();
        pause(4000);


        //driver.close();
        driver.quit();


    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
