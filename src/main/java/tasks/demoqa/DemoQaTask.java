package tasks.demoqa;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.JavascriptExecutor;
import userinterfaces.demoqa.DemoQaUI;

public class DemoQaTask {

    private DemoQaTask() {
    }

    public static Performable abrirDemoQa() {
        return Task.where("{0} abre el módulo Elements",
                Open.url("https://demoqa.com/elements")
        );
    }

    public static Performable seleccionarElemento(String elemento) {
        return Task.where("{0} interactúa con " + elemento,
                Click.on(DemoQaUI.BTN_MENU_LATERAL.of(elemento)),
                ejecutarInteraccion(elemento)
        );
    }

    private static Performable ejecutarInteraccion(String elemento) {

        switch (elemento) {

            case "Text Box":
                return interaccionConTextBox();

            case "Check Box":
                return interaccionConCheckBox();

            default:
                throw new IllegalArgumentException(
                        "Elemento no soportado: " + elemento
                );
        }
    }

    private static Performable interaccionConTextBox() {
        return Task.where("{0} diligencia Text Box",
                Enter.theValue("Dennis").into(DemoQaUI.INPUT_TEXT),
                Enter.theValue("test@hotmail.com").into(DemoQaUI.INPUT_EMAILTEXT),
                Enter.theValue("Calle Temporal 123")
                        .into(DemoQaUI.TEXTAREA_CURRENT_ADDRESS),
                Enter.theValue("Calle Permanente 456")
                        .into(DemoQaUI.TEXTAREA_PERMANENT_ADDRESS),
                Click.on(DemoQaUI.BTN_SUBMIT)
        );
    }

    private static Performable interaccionConCheckBox() {
        return Task.where("{0} interactúa con Check Box",
                Click.on(DemoQaUI.TREE_SWITCHER_HOME),
                Click.on(DemoQaUI.CHECKBOX_HOME)
        );
    }
}