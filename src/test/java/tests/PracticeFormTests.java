package tests;

import dto.Student;
import enums.Gender;
import enums.Hobbies;
import enums.StateCity;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends AppManager {

    @Test
    public void practiceFormPositiveTest(){
        List<Hobbies> hobbies = new ArrayList<>();
        hobbies.add(Hobbies.MUSIC);
        hobbies.add(Hobbies.READING);
        hobbies.add(Hobbies.SPORTS);
        Student student = new Student("Eva", "Brown",
                "eb@mail.com", Gender.FEMALE,
                "1234567890", "01 Oct 2000",
                "Maths,Chemistry,Commerce",
                hobbies,"",
                "Independence 12",
                StateCity.HARYANA.getState(), StateCity.HARYANA.getCity()[0]);
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);

    }

}
