package co.com.AutoFusdec.stepsdefinitions.stepsColegio;

import co.com.AutoFusdec.models.colegio.FormularioColegio;
import co.com.AutoFusdec.tasks.colegio.CreacionColegio;
import co.com.AutoFusdec.questions.colegio.ValidacionCrearColegio;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CrearColegioStepDefinitions {

    @Cuando("^este en la pagina de collegio diligenciar el formulario:$")
    public void esteEnLaPaginaDeCollegioDiligenciarElFormulario(List<FormularioColegio> colegio) {
        theActorInTheSpotlight().attemptsTo(CreacionColegio.conLosDatos(colegio));

    }

    @Entonces("^se debe verificar que el colegio se cree de manera correcta y se agregue en la lista de colegios\\.$")
    public void seDebeVerificarQueElColegioSeCreeDeManeraCorrectaYSeAgregueEnLaListaDeColegios() {

        theActorInTheSpotlight().should(seeThat(ValidacionCrearColegio.seCreoColegio()));
    }

}
