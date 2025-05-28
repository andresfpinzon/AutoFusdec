package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.curso.FormularioCurso;
import co.com.AutoFusdec.tasks.curso.CreacionCurso;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearCursoStepDefinitions {

    @Cuando("^este en la pagina de cursos diligenciar correctamente el formulario y dar clic a crear curso:$")
    public void esteEnLaPaginaDeCursosDiligenciarCorrectamenteElFormularioYDarClicACrearCurso(List<FormularioCurso> curso) {

        theActorInTheSpotlight().attemptsTo(CreacionCurso.aute(curso));

    }

    @Entonces("^se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios\\.$")
    public void seDebeVerificarQueElUsuarioSeCreeCorrectamenteYSeAgregueALaListaDeUsuarios() {
        throw new PendingException();
    }

}