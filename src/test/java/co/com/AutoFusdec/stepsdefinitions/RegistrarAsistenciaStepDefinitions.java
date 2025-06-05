package co.com.AutoFusdec.stepsdefinitions;


import co.com.AutoFusdec.models.autenticacion.AutenticacionModel;
import co.com.AutoFusdec.questions.registrarAsistencia.ValidacionRegistroAsistencia;
import co.com.AutoFusdec.tasks.autenticacion.AutenticacionTask;
import co.com.AutoFusdec.tasks.registrarAsistencia.RegistrarAsistenciaTask;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistrarAsistenciaStepDefinitions {

    @Cuando("^estoy en la página de gestión de asistencias busco al estudiante con número de documento \"([^\"]*)\"$")
    public void estoyEnLaPáginaDeGestiónDeAsistenciasBuscoAlEstudianteConNúmeroDeDocumento(String arg1) {
        theActorInTheSpotlight().attemptsTo(RegistrarAsistenciaTask.conDocumento(arg1));
    }
    @Entonces("^debo ver al estudiante con documento \"([^\"]*)\" en el historial de asistencia$")
    public void deboVerAlEstudianteConDocumentoEnElHistorialDeAsistencia(String arg1) {
        theActorInTheSpotlight().should(seeThat(ValidacionRegistroAsistencia.conDocumento(arg1)));
    }
}
