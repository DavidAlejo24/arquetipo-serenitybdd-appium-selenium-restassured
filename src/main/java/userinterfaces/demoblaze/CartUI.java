package userinterfaces.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;


public class CartUI extends PageObject {

    public static final Target NOMBRE_PRODUCTO_AGREGADO = Target.the("Nombre del producto {0} agregado al carrito").locatedBy("//tbody[@id='tbodyid']/tr[{0}]/td[2]").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target PRECIO_PRODUCTO_AGREGADO = Target.the("Precio del producto {0} agregado al carrito").locatedBy("//tbody[@id='tbodyid']//tr[td[2][contains(normalize-space(), '{0}')]]/td[3]").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target LBL_TOTAL_PAGAR = Target.the("Precio total a pagar").locatedBy("//h3[@id='totalp']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target BTN_PLACE_ORDER = Target.the("Boton Realizar Compra").locatedBy("//button[contains(text(), 'Place Order')]").waitingForNoMoreThan(Duration.ofSeconds(10));


}
