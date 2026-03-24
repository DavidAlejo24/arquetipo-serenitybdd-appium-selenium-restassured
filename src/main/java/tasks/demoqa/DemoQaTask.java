package tasks.demoqa;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterfaces.demoqa.DemoQaUI;
import org.openqa.selenium.ElementClickInterceptedException;

public class DemoQaTask {

    public static DemoQaTask interactuandoCon() {
        return new DemoQaTask();
    }

    public static Performable elementos(String elemento){
        return Task.where("{0} intenta hacer click en " + elemento, actor -> {
            try {
                // Intento inicial
                actor.attemptsTo(
                        Click.on(DemoQaUI.BTN_MENU_LATERAL.of(elemento)),
                        elijiendoElemento(elemento)
                );
            } catch (ElementClickInterceptedException e) {
                System.out.println("Click interceptado por otro elemento. Haciendo scroll y reintentando...");
                actor.attemptsTo(
                        Scroll.to(DemoQaUI.BTN_MENU_LATERAL.of(elemento)),
                        Click.on(DemoQaUI.BTN_MENU_LATERAL.of(elemento))
                );
            }
        });

    }

    public static Performable elijiendoElemento(String elemento){
        if(elemento.equals("Text Box")){
            return Task.where("{0} interactua con los UI de text box", actor ->{
                actor.attemptsTo(
                        interaccionConTextBox()
                );
            });
        } else if (elemento.equals("Check Box")){
            return Task.where("{0} interactua con los UI de text box", actor ->{
                actor.attemptsTo(
                        interaccionConCheckBox()
                );
            });
        }
        throw new IllegalArgumentException("Opción no soportada en el Feature: " + elemento);
    }

    public static Performable interaccionConTextBox(){
        return Task.where(actor -> {
            actor.attemptsTo(
                    Enter.theValue("David").into(DemoQaUI.INPUT_TEXT),
                    Clear.field(DemoQaUI.INPUT_TEXT),
                    Enter.theValue("Alejandro").into(DemoQaUI.INPUT_TEXT),
                    Enter.theValue("david3505@hotmail.com").into(DemoQaUI.INPUT_EMAILTEXT),
                    Hit.the(Keys.TAB).into(DemoQaUI.INPUT_EMAILTEXT)
                    //Enter.theValue("Calle Temporal 123").into(DemoQaUI.TEXTAREA_CURRENT_ADDRESS)
            );
        });
    }
    public static Performable interaccionConCheckBox(){
        return Task.where(actor -> {
            actor.attemptsTo(
                    SetCheckbox.of(DemoQaUI.INPUT_CHECKBOX).toTrue()
            );
        });
    }

}
