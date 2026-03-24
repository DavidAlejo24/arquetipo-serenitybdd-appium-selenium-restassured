package userinterfaces.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;


public class RealizarPedidoUI extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("Input Nombre").locatedBy("//div[@class='modal-content']//input[@id='name']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target INPUT_PAIS = Target.the("Input Pais").locatedBy("//div[@class='modal-content']//input[@id='country']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target INPUT_CIUDAD = Target.the("Input Ciudad").locatedBy("//div[@class='modal-content']//input[@id='city']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target INPUT_TARJETA = Target.the("Input Tarjeta").locatedBy("//div[@class='modal-content']//input[@id='card']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target INPUT_MES = Target.the("Input Mes").locatedBy("//div[@class='modal-content']//input[@id='month']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target INPUT_ANIO = Target.the("Input Año").locatedBy("//div[@class='modal-content']//input[@id='year']").waitingForNoMoreThan(Duration.ofSeconds(10));
    public static final Target BTN_PURCHASE = Target.the("Boton Comprar").locatedBy("//div[@class='modal-content']//button[contains(text(),'Purchase')]").waitingForNoMoreThan(Duration.ofSeconds(10));

}
