package pages;

import dto.Student;
import enums.Gender;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);

    }

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement fieldFirstName;
    @FindBy(id = "lastName")
    WebElement fieldLastName;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement fieldEmail;
    @FindBy(id = "userNumber")
    WebElement fieldMobile;
    @FindBy(id = "currentAddress")
    WebElement fieldCurAddress;

    @FindBy(id = "dateOfBirthInput")
    WebElement fieldDateOfBirth;


    public void typePracticeForm(Student student) {
        hideBanner();
        hideFooter();
        fieldFirstName.sendKeys(student.getFirstName());
        fieldLastName.sendKeys(student.getLastName());
        fieldEmail.sendKeys(student.getEmail());
        typeGender(student.getGender());
        fieldMobile.sendKeys(student.getMobile());
        typeDateOfBirth(student.getDateOfBirth());
        //fieldDateOfBirth.sendKeys(student.getDateOfBirth());
        fieldCurAddress.sendKeys(student.getAddress());

    }

    private void typeGender(Gender gender) {
        WebElement btnGender = driver.findElement(By.xpath(gender.getLocator()));
        btnGender.click();

    }

    private void typeDateOfBirth(String dateOfBirth) {
        fieldDateOfBirth.click();
        String operationSystem = System.getProperty("os.name");
        System.out.println(operationSystem);
        if (operationSystem.startsWith("Win")) fieldDateOfBirth.sendKeys
                (Keys.chord(Keys.CONTROL, "a"));
        else if (operationSystem.startsWith("Mac"))
            fieldDateOfBirth.sendKeys
                    (Keys.chord(Keys.COMMAND, "a"));
            fieldDateOfBirth.sendKeys(dateOfBirth);
            fieldDateOfBirth.sendKeys(Keys.ENTER);

        }


    }
