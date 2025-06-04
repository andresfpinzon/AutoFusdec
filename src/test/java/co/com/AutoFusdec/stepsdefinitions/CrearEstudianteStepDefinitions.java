package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.estudiante.FormularioEstudiante;
import co.com.AutoFusdec.questions.estudiante.EstudianteCreado;
import co.com.AutoFusdec.questions.estudiante.EstudianteEliminado;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.tasks.estudiante.CreacionEstudiante;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;


import java.util.List;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearEstudianteStepDefinitions {

    @Cuando("^este en la pagina de estudiantes diligendiar correctamente el formulario y dar clic a crear estudiante$")
    public void esteEnLaPaginaDeEstudiantesDiligendiarCorrectamenteElFormularioYDarClicACrearEstudiante(List<FormularioEstudiante> datosEstudiante) {
        theActorInTheSpotlight().attemptsTo(CreacionEstudiante.conLosDatos(datosEstudiante));
    }

    @Entonces("^se debe verificar que el estudiante se cree correctamente y se agregue a la lista de estudiantes\\.$")
    public void seDebeVerificarQueElEstudianteSeCreeCorrectamenteYSeAgregueALaListaDeEstudiantes() {
        theActorInTheSpotlight().should(seeThat(EstudianteCreado.seCreo()));
    }


}
