package poc.stepdefinitios;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.web.DemoQaTask;
import tasks.web.NavigateTo;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoQaStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el {actor} accede a demoqa.com")
    public void accedeAlSistema(Actor actor) {
        actor.wasAbleTo(NavigateTo.demoQa());
    }


    @Cuando("interactua con los elementos:")
    public void agrega_los_siguientes_productos_a_su_lista(List<String> elementos) {
        elementos.forEach(elemento -> {
                theActorInTheSpotlight().attemptsTo(
                        DemoQaTask.interactuandoCon().elementos(elemento)
                );
        });
    }

    @Entonces("deberia ver un cambio en el comportamiento de los elementos")
    public void deberiaVerUnCambioEnElComportamientoDeLosElementos(){
        System.out.println("Paso 3");
    }

}
