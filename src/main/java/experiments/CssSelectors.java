package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        hideBanner();

        divElements.click();
        pause(4000);

        // WebElement radioButton = driver.findElement(By.cssSelector("li[id='item-2']"));
        //WebElement radioButton = driver.findElement(By.id("item-2"));
        WebElement radioButton = driver.findElement(By.cssSelector("#item-2"));
        radioButton.click();
        pause(4000);

        //driver.navigate().back();
        //driver.navigate().back();
        WebElement btnYes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        hideFooter();
        btnYes.click();

        driver.navigate().back();
        driver.navigate().back();

        WebElement divBookStore = driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:last-child"));
        divBookStore.click();
        pause(4000);
        driver.navigate().back();
        pause(4000);
        WebElement divWidgets= driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:nth-child(4)"));
        divWidgets.click();
        pause(4000);
        driver.navigate().back();
        pause(4000);

        WebElement divAlerts= driver.findElement(By.cssSelector("div[class='category-cards'] " +
                "div[class='card mt-4 top-card']:nth-child(3) div[class='card-body'] h5"));
        System.out.println(divAlerts.getText());



        //driver.close();
        driver.quit();
    }

    @Test
    public void clickChekBox(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        hideBanner();
        WebElement divElements = driver.findElement(By.cssSelector(".card"));
        //WebElement divElements = driver.findElement(By.cssSelector("div[class='card mt-4 top-card']"));
        divElements.click();
        WebElement btnCheckBox = driver.findElement(By.id("item-1"));
        //WebElement btnCheckBox = driver.findElement(By.cssSelector("#item-1"));
        //WebElement btnCheckBox = driver.findElement(By.cssSelector("li[id='item-1']"));
        //WebElement btnCheckBox = driver.findElement(By.cssSelector("*[id='item-1']"));
        btnCheckBox.click();

        hideFooter();
        WebElement checkBox = driver.findElement(By
                .cssSelector("svg[class='rct-icon rct-icon-uncheck']"));
        checkBox.click();
        pause(4000);
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
