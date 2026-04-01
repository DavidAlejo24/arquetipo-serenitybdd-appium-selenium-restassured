package tasks.demoblaze;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.demoblaze.RealizarPedidoUI;


public class CompletarPedido implements Task {

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjeta;
    private String mes;
    private String anio;


    public CompletarPedido(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio){
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tarjeta = tarjeta;
        this.mes = mes;
        this.anio = anio;
    }

    public static CompletarPedido conDatosCliente(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio){
        return Tasks.instrumented(CompletarPedido.class, nombre,pais,ciudad,tarjeta,mes,anio);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Task.where("Completa el formulario con sus datos",
                Enter.theValue(nombre).into(RealizarPedidoUI.INPUT_NOMBRE).thenHit(Keys.TAB),
                Enter.theValue(pais).into(RealizarPedidoUI.INPUT_PAIS).thenHit(Keys.TAB),
                Enter.theValue(ciudad).into(RealizarPedidoUI.INPUT_CIUDAD).thenHit(Keys.TAB),
                Enter.theValue(tarjeta).into(RealizarPedidoUI.INPUT_TARJETA).thenHit(Keys.TAB),
                Enter.theValue(mes).into(RealizarPedidoUI.INPUT_MES).thenHit(Keys.TAB),
                Enter.theValue(anio).into(RealizarPedidoUI.INPUT_ANIO).thenHit(Keys.TAB),
                Click.on(RealizarPedidoUI.BTN_PURCHASE).afterWaitingUntilEnabled()
        ));
    }
}
