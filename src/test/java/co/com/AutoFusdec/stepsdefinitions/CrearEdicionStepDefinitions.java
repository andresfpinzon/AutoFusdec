package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.edicion.FormularioEdicion;
import co.com.AutoFusdec.models.usuario.FormularioUsuario;
import co.com.AutoFusdec.questions.usuario.ValidacionCrearUsuario;
import co.com.AutoFusdec.tasks.edicion.CreacionEdicion;
import co.com.AutoFusdec.tasks.usuario.CreacionUsuario;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearEdicionStepDefinitions {

    @Cuando("^este en la pagina de ediciones diligenciar correctamente el formulario y dar clic a crear edicion:$")
    public void esteEnLaPaginaDeEdicionesDiligenciarCorrectamenteElFormularioYDarClicACrearEdicion( List<FormularioEdicion> edicion ) {
        theActorInTheSpotlight().attemptsTo(CreacionEdicion.aute(edicion));
    }


    @Entonces("^se debe verificar que la edicion se cree correctamente y se agregue a la lista de ediciones\\.$")
    public void seDebeVerificarQueLaEdicionSeCreeCorrectamenteYSeAgregueALaListaDeEdiciones() {
        throw new PendingException();
    }

}
