package co.com.AutoFusdec.stepsdefinitions.stepsUnidad;

import co.com.AutoFusdec.questions.unidad.ValidacionCrearUnidad;
import co.com.AutoFusdec.tasks.unidad.CrearUnidadTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CrearUnidadStepDefinitions {
    @Cuando("^estoy en la página de gestión de Unidades dar click en agregar, ingresar \"([^\"]*)\" y confirmar$")
    public void estoyEnLaPáginaDeGestiónDeUnidadesDarClickEnAgregarIngresarYConfirmar(String name) {
        theActorInTheSpotlight().attemptsTo(CrearUnidadTask.intoName(name));
    }


    @Entonces("^se debe verificar que la unidad se cree correctamente$")
    public void seDebeVerificarQueLaUnidadSeCreeCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearUnidad.creado()));
    }
}
