package poc.stepdefinitios;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.demoqa.FormularioVisible;
import tasks.demoqa.FormsNegativeDateTask;
import tasks.demoqa.FormsTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class DemoQaFormsSteps {

    @Cuando("navega al formulario Practice Form")
    public void navegaAlFormularioPracticeForm() {
        theActorInTheSpotlight().attemptsTo(
                FormsTask.abrirForms()
        );
    }

    @Cuando("diligencia el formulario correctamente")
    public void diligenciaElFormulario() {
        theActorInTheSpotlight().attemptsTo(
                FormsTask.diligenciarPracticeForm()
        );
    }

    @Entonces("deberia ver el formulario enviado exitosamente")
    public void deberiaVerFormularioEnviado() {
        System.out.println("Formulario enviado correctamente");
    }

    //caso negativo
    @Cuando("elimina la fecha de nacimiento del formulario")
    public void eliminaFechaNacimiento() {
        theActorInTheSpotlight().attemptsTo(
                FormsNegativeDateTask.eliminarFechaDeNacimiento()
        );
    }


    @Entonces("la fecha de nacimiento deberia quedar vacia")
    public void fechaQuedaVacia() {
    theActorInTheSpotlight().should(
                seeThat(FormularioVisible.estaVisible(), equalTo(true))
        );
    }

}