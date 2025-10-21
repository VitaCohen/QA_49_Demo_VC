package tests;

import dto.Student;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {

    @Test
    public void practiceFormPositiveTest(){
        Student student = new Student("Eva", "Brown",
                "eb@mail.com", "female",
                "1234567890", "01 Oct 2000",
                "Maths,Chemistry,Commerce",
                "Sports","",
                "Indep 12", "NCR", "Delhi");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);

    }

}
