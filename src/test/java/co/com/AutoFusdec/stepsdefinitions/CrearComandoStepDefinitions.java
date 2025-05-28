package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.comando.FormularioComando;
import co.com.AutoFusdec.models.estudiante.FormularioEstudiante;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.questions.usogeneral.RegistroEliminado;
import co.com.AutoFusdec.tasks.comando.CreacionComando;
import co.com.AutoFusdec.tasks.usogeneral.EliminarRegistro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.AutoFusdec.userinterface.comando.CrearComando.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearComandoStepDefinitions {
    @Cuando("^este en la pagina de comandos diligendiar correctamente el formulario y dar clic a crear comando$")
    public void esteEnLaPaginaDeComandosDiligendiarCorrectamenteElFormularioYDarClicACrearComando(List<FormularioComando> datosComando) {
        theActorInTheSpotlight().attemptsTo(CreacionComando.conLosDatos(datosComando));

    }

    @Entonces("^se debe verificar que el comando se cree correctamente y se agregue a la lista de comandos\\.$")
    public void seDebeVerificarQueElComandoSeCreeCorrectamenteYSeAgregueALaListaDeComandos() {
        theActorInTheSpotlight().should(seeThat(RegistroCreado.enTabla(PAGINACION_COMANDOS)));
    }

    @Entonces("se debe eliminar este comando")
    public void eliminarComando(List<FormularioComando> datosComando) {
        theActorInTheSpotlight().attemptsTo(
                EliminarRegistro.con(
                        datosComando,
                        BUSQUEDA_COMANDOS,
                        BTN_ELIMINAR_COMANDO,
                        BTN_CONFIRMAR_ELIMINAR_COMANDO,
                        PAGINACION_COMANDOS
                )
        );
        theActorInTheSpotlight().should(seeThat(RegistroEliminado.enTabla(PAGINACION_COMANDOS)));
    }
}
