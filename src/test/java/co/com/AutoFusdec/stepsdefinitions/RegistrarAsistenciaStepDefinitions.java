package co.com.AutoFusdec.stepsdefinitions;


import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class RegistrarAsistenciaStepDefinitions {
    /*@Dado("^que el usuario se encuentra autenticado$")
    public void queElUsuarioSeEncuentraAutenticado() {

    }*/


    @Cuando("^estoy en la página de gestión de asistencias busco al estudiante con número de documento$")
    public void estoyEnLaPáginaDeGestiónDeAsistenciasBuscoAlEstudianteConNúmeroDeDocumento(DataTable arg1) {

    }

    @Entonces("^marco el checkbox de asistencia del estudiante guardo los cambios debo ver un mensaje de confirmación \"Asistencia registrada correctamente$")
    public void marcoElCheckboxDeAsistenciaDelEstudianteGuardoLosCambiosDeboVerUnMensajeDeConfirmaciónAsistenciaRegistradaCorrectamente() {

    }
}
