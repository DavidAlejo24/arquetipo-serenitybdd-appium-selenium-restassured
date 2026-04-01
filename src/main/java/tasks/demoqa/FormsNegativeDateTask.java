package tasks.demoqa;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

public class FormsNegativeDateTask {

    private FormsNegativeDateTask() {}

    public static Performable eliminarFechaDeNacimiento() {
        return Task.where("{0} elimina la fecha de nacimiento via JavaScript (known issue)",
                actor -> {
                    JavascriptExecutor js = (JavascriptExecutor)
                            BrowseTheWeb.as(actor).getDriver();

                    js.executeScript(
                            "document.getElementById('dateOfBirthInput').value='';"
                    );
                }
        );
    }
}
