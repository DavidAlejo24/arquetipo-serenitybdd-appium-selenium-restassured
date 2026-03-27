package tasks.demoqa;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterfaces.demoqa.DemoQaFormsUI;

import java.nio.file.Paths;

public class FormsTask {

    private FormsTask() {
    }

    public static Performable abrirForms() {
        return Task.where("{0} abre el módulo Forms",
                Scroll.to(DemoQaFormsUI.BTN_FORMS),
                Click.on(DemoQaFormsUI.BTN_FORMS),
                Click.on(DemoQaFormsUI.BTN_PRACTICE_FORM)
        );
    }

    public static Performable diligenciarPracticeForm() {
        return Task.where("{0} diligencia correctamente el Practice Form",

                Enter.theValue("Dennis").into(DemoQaFormsUI.INPUT_FIRST_NAME),
                Enter.theValue("Montalvo").into(DemoQaFormsUI.INPUT_LAST_NAME),
                Enter.theValue("test@hotmail.com").into(DemoQaFormsUI.INPUT_EMAIL),

                Click.on(DemoQaFormsUI.RADIO_GENDER_MALE),
                Enter.theValue("3123456789").into(DemoQaFormsUI.INPUT_MOBILE),

                Click.on(DemoQaFormsUI.INPUT_DATE_OF_BIRTH),
                SelectFromOptions.byVisibleText("September")
                        .from(DemoQaFormsUI.DATE_PICKER_MONTH),
                SelectFromOptions.byVisibleText("1995")
                        .from(DemoQaFormsUI.DATE_PICKER_YEAR),
                Click.on(DemoQaFormsUI.DATE_PICKER_DAY_10),

                Enter.theValue("Maths")
                        .into(DemoQaFormsUI.INPUT_SUBJECTS)
                        .thenHit(Keys.ENTER),

                Click.on(DemoQaFormsUI.CHECKBOX_SPORTS),

                Upload.theFile(
                        Paths.get("src/test/resources/files/foto.png")
                ).to(DemoQaFormsUI.INPUT_UPLOAD_PICTURE),

                Enter.theValue("Calle Temporal 123")
                        .into(DemoQaFormsUI.TEXTAREA_ADDRESS),

                Click.on(DemoQaFormsUI.DROPDOWN_STATE),
                Enter.theValue("NCR")
                        .into(DemoQaFormsUI.INPUT_STATE)
                        .thenHit(Keys.ENTER),

                Click.on(DemoQaFormsUI.DROPDOWN_CITY),
                Enter.theValue("Delhi")
                        .into(DemoQaFormsUI.INPUT_CITY)
                        .thenHit(Keys.ENTER),

                Scroll.to(DemoQaFormsUI.BTN_SUBMIT),
                Click.on(DemoQaFormsUI.BTN_SUBMIT),

                Scroll.to(DemoQaFormsUI.MODAL_CONFIRMATION)
        );
    }
}