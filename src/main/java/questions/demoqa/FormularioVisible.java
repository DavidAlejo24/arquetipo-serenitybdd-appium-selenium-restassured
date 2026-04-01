package questions.demoqa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FormularioVisible implements Question<Boolean> {



    @Override
    public Boolean answeredBy(Actor actor) {
        JavascriptExecutor js =
                (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

        String valor = (String) js.executeScript(
                "return document.getElementById('dateOfBirthInput').value;"
        );

        return valor == null || valor.trim().isEmpty();
    }



    public static FormularioVisible estaVisible() {
        return new FormularioVisible();
    }
}
