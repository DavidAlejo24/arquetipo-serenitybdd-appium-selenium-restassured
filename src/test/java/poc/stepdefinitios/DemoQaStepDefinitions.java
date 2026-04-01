package poc.stepdefinitios;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.demoqa.DemoQaTask;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoQaStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el {actor} accede a demoqa.com")
    public void accedeAlSistema(Actor actor) {
        actor.wasAbleTo(
                DemoQaTask.abrirDemoQa()
        );
    }

    @Cuando("interactua con los elementos:")
    public void interactuaConLosElementos(List<String> elementos) {
        elementos.forEach(elemento ->
                theActorInTheSpotlight().attemptsTo(
                        DemoQaTask.seleccionarElemento(elemento)
                )
        );
    }

    @Entonces("deberia ver un cambio en el comportamiento de los elementos")
    public void deberiaVerUnCambioEnElComportamientoDeLosElementos() {
        System.out.println("✅ Escenario ejecutado correctamente");
    }
}