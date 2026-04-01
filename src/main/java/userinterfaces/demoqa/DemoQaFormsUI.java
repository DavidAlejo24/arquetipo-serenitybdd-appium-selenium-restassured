package userinterfaces.demoqa;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoQaFormsUI {

    private DemoQaFormsUI() {
    }

    public static final Target BTN_FORMS =
            Target.the("Botón Forms")
                    .located(By.xpath("//h5[text()='Forms']"));

    public static final Target BTN_PRACTICE_FORM =
            Target.the("Practice Form")
                    .located(By.xpath("//span[text()='Practice Form']"));

    public static final Target INPUT_FIRST_NAME =
            Target.the("First Name")
                    .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME =
            Target.the("Last Name")
                    .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =
            Target.the("Email")
                    .located(By.id("userEmail"));

    public static final Target RADIO_GENDER_MALE =
            Target.the("Gender Male")
                    .located(By.xpath("//label[text()='Male']"));

    public static final Target INPUT_MOBILE =
            Target.the("Mobile Number")
                    .located(By.id("userNumber"));

    public static final Target INPUT_DATE_OF_BIRTH =
            Target.the("Date of Birth")
                    .located(By.id("dateOfBirthInput"));

    public static final Target DATE_PICKER_MONTH =
            Target.the("Month selector")
                    .located(By.className("react-datepicker__month-select"));

    public static final Target DATE_PICKER_YEAR =
            Target.the("Year selector")
                    .located(By.className("react-datepicker__year-select"));

    public static final Target DATE_PICKER_DAY_10 =
            Target.the("Day 10")
                    .located(By.xpath("//div[contains(@class,'react-datepicker__day--010') and not(contains(@class,'outside-month'))]"));

    public static final Target INPUT_SUBJECTS =
            Target.the("Subjects")
                    .located(By.id("subjectsInput"));

    public static final Target CHECKBOX_SPORTS =
            Target.the("Hobby Sports")
                    .located(By.xpath("//label[text()='Sports']"));

    public static final Target INPUT_UPLOAD_PICTURE =
            Target.the("Upload Picture")
                    .located(By.id("uploadPicture"));

    public static final Target TEXTAREA_ADDRESS =
            Target.the("Current Address")
                    .located(By.id("currentAddress"));

    public static final Target DROPDOWN_STATE =
            Target.the("State dropdown")
                    .located(By.id("state"));

    public static final Target INPUT_STATE =
            Target.the("State input")
                    .located(By.id("react-select-3-input"));

    public static final Target DROPDOWN_CITY =
            Target.the("City dropdown")
                    .located(By.id("city"));

    public static final Target INPUT_CITY =
            Target.the("City input")
                    .located(By.id("react-select-4-input"));

    public static final Target BTN_SUBMIT =
            Target.the("Submit")
                    .located(By.id("submit"));

    public static final Target MODAL_CONFIRMATION =
            Target.the("Modal de confirmación")
                    .located(By.className("modal-content"));
}
