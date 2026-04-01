package userinterfaces.demoqa;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class DemoQaUI extends PageObject {

    public static final Target BTN_MENU_LATERAL =
            Target.the("Elemento del menú lateral")
                    .locatedBy("//span[normalize-space(text())='{0}']")
                    .waitingForNoMoreThan(Duration.ofSeconds(10));

    // Check Box
    public static final Target TREE_SWITCHER_HOME =
            Target.the("Switcher Home")
                    .locatedBy("//span[contains(@class,'rc-tree-switcher')]")
                    .waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target CHECKBOX_HOME =
            Target.the("Checkbox Home")
                    .locatedBy("//span[@class='rc-tree-checkbox' and @aria-label='Select Home']")
                    .waitingForNoMoreThan(Duration.ofSeconds(10));

    // Text Box
    public static final Target INPUT_TEXT = Target.the("Input nombre").locatedBy("#userName");
    public static final Target INPUT_EMAILTEXT = Target.the("Input email").locatedBy("#userEmail");
    public static final Target TEXTAREA_CURRENT_ADDRESS = Target.the("Dirección actual").locatedBy("#currentAddress");
    public static final Target TEXTAREA_PERMANENT_ADDRESS = Target.the("Dirección permanente").locatedBy("#permanentAddress");
    public static final Target BTN_SUBMIT = Target.the("Botón Submit").locatedBy("#submit");
}
