package userinterfaces.demoqa;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class DemoQaUI extends PageObject {

    public static final Target BTN_MENU_LATERAL = Target.the("Boton de Elemento del Menu Lateral").locatedBy("//span[contains(text(),'{0}')]/parent::a[@class='router-link']").waitingForNoMoreThan(Duration.ofSeconds(7));
    public static final Target INPUT_TEXT = Target.the("Input para ingresar el nombre").locatedBy("//input[@type='text']").waitingForNoMoreThan(Duration.ofSeconds(7));
    public static final Target INPUT_EMAILTEXT = Target.the("Input para ingresar el correo electronico").locatedBy("//input[@type='email']").waitingForNoMoreThan(Duration.ofSeconds(7));
    public static final Target TEXTAREA_CURRENT_ADDRESS = Target.the("Input para ingresar la dirección actual").locatedBy("//textarea[@id='currentAddress']").waitingForNoMoreThan(Duration.ofSeconds(7));
    public static final Target TEXTAREA_PERMANENT_ADDRESS = Target.the("Input para ingresar la dirección permanente").locatedBy("//textarea[@id='permanentAddress']").waitingForNoMoreThan(Duration.ofSeconds(7));
    public static final Target BTN_SUBMIT = Target.the("Botón de guardar").locatedBy("//button[@id='submit']").waitingForNoMoreThan(Duration.ofSeconds(7));
    public static final Target BOX_OUTPUT = Target.the("Botón de salida").locatedBy("//div[@id='output']").waitingForNoMoreThan(Duration.ofSeconds(7));

    //CheckBox
    public static final Target INPUT_CHECKBOX = Target.the("Checkbox de ejemplo").locatedBy("//div[@role='treeitem']//span[@role='checkbox']").waitingForNoMoreThan(Duration.ofSeconds(7));





}