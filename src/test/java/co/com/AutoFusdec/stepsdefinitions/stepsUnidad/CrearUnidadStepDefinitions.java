package co.com.AutoFusdec.stepsdefinitions.stepsUnidad;

import co.com.AutoFusdec.models.unidad.UnidadModel;
import co.com.AutoFusdec.questions.unidad.ValidacionCrearUnidad;
import co.com.AutoFusdec.tasks.unidad.CrearUnidadTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CrearUnidadStepDefinitions {
    @Cuando("^estoy en la página de gestión de Unidades dar click en agregar, completar campos y confirmar$")
    public void estoyEnLaPáginaDeGestiónDeUnidadesDarClickEnAgregarCompletarCamposYConfirmar(List<UnidadModel> arg1) {
        theActorInTheSpotlight().attemptsTo(CrearUnidadTask.intoName(arg1));
    }


    @Entonces("^se debe verificar que la unidad se cree correctamente$")
    public void seDebeVerificarQueLaUnidadSeCreeCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearUnidad.validacionCompleta()));
    }
}
