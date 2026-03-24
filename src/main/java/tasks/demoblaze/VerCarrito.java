package tasks.demoblaze;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.demoblaze.CartUI;
import userinterfaces.demoblaze.HeaderUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotEmpty;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static org.junit.Assert.assertEquals;
import questions.demoblaze.labelsProductosAdquiridos;


public class VerCarrito implements Task {

    private String eligiendo;


    public VerCarrito(String eligiendo){
        this.eligiendo = eligiendo;
    }

    public static VerCarrito deCompras(){
        return Tasks.instrumented(VerCarrito.class, "categoria");
    }



    @Override
    public <T extends Actor> void performAs(T actor){
        theActorInTheSpotlight().attemptsTo(Task.where("Navegar al Carrito y revisa que los nombres y precios de la tabla coincidan con los productos agregados aleatoriamente",
            Click.on(HeaderUI.LINK_CART).afterWaitingUntilEnabled()
        ));
        //Revisa que los productos agregados coincidan en nombre y precio
        for(int i=1; i<3; i++){
            String nameProductActual = theActorInTheSpotlight().asksFor(labelsProductosAdquiridos.getNombreProductoAdquirido(String.valueOf(i)));
            String precioProductActual = theActorInTheSpotlight().asksFor(labelsProductosAdquiridos.getPrecioProductoAdquirido(nameProductActual));
            String nameRecordado = theActorInTheSpotlight().recall("producto"+ nameProductActual);
            String precioRecordado = theActorInTheSpotlight().recall("precio"+ nameProductActual);
            assertEquals(nameRecordado,nameProductActual);
            assertEquals(precioRecordado,"$"+precioProductActual);
        }

        //Revisa que el valor total a pagar exista
        //actor.should(seeThat("Total a pagar", CartUI.LBL_TOTAL_PAGAR.resolveFor(actor), isNotEmpty()));        //Preciona en Place Order
        theActorInTheSpotlight().attemptsTo(
                Click.on(CartUI.BTN_PLACE_ORDER).afterWaitingUntilEnabled()
        );

    }
}
