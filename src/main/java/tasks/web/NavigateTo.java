package tasks.web;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class NavigateTo {

    public static Performable demoBlazePage() {
        return Task.where("{0} navega hacia la pagina principal de DemoBlaze",
                Open.browserOn().the(GoHomePage.class));
    }

    public static Performable demoQa(){
        // Crear las variables de entorno
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        // Obtener la URL específica del entorno desde serenity.conf
        String baseUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("environments.chrome.webdriver.base.url");
        // Imprimir la URL utilizada
        System.out.println("Using base URL: " + baseUrl);
        // Retornar la tarea de navegar a la página de login
        return Task.where("{0} navigate to page DemoBlaze",
                Open.url(baseUrl)
        );
    }

}
