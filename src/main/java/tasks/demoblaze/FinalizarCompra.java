package tasks.demoblaze;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.demoblaze.ConfirmacionCompraUI;
import userinterfaces.demoblaze.RealizarPedidoUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FinalizarCompra implements Task {

    private String nombre;


    public FinalizarCompra(String nombre){
        this.nombre = nombre;
    }

    public static FinalizarCompra ahora(String nombre){
        return Tasks.instrumented(FinalizarCompra.class, nombre);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        //Revisa que la compra se haya hecho con exito de 2 formas diferentes con assertEquals y containsText
        assertEquals(ConfirmacionCompraUI.LBL_COMPRA_EXITOSA.resolveFor(actor).getText(),"Thank you for your purchase!");
        //actor.should(seeThat(the(ConfirmacionCompraUI.LBL_NOMBRE_COMPRADOR.of(nombre)), containsText(nombre)));
        //Finaliza la compra
        actor.attemptsTo(Task.where("Finaliza la compra de los productos en demoBlaze",
                Click.on(RealizarPedidoUI.BTN_PURCHASE).afterWaitingUntilEnabled()
        ));
    }
}
