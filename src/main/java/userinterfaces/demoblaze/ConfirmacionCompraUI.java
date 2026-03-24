package userinterfaces.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;


public class ConfirmacionCompraUI extends PageObject {

    public static final Target LBL_COMPRA_EXITOSA = Target.the("Label Compra exitosa").locatedBy("//div[contains(@class,'sweet-alert')]//h2[text()='Thank you for your purchase!']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target LBL_NOMBRE_COMPRADOR = Target.the("Label Nombre del Comprador").locatedBy("//div[contains(@class,'sweet-alert')]//p[contains(normalize-space(), 'Name: {0}')]").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target BTN_OK = Target.the("Boton Compra Exitosa").locatedBy("//div[contains(@class,'sweet-alert')]//button[contains(@class,'confirm') and text()='OK']").waitingForNoMoreThan(Duration.ofSeconds(10));

}
