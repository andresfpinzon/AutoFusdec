package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.login.FormularioLogin;
import co.com.AutoFusdec.questions.estudiante.EstudianteCreado;
import co.com.AutoFusdec.questions.login.ValidacionLoginA;
import co.com.AutoFusdec.tasks.AbrirPaginaFusdec;
import co.com.AutoFusdec.tasks.autenticacion.AutenticacionTask;
import co.com.AutoFusdec.tasks.login.LoginTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Dado("^que el usuario ya creado se encuentre en la pagina de incio de sesion$")
    public void queElUsuarioYaCreadoSeEncuentreEnLaPaginaDeIncioDeSesion() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaFusdec.laPagina());
                   }


    @Cuando("^llene correctamente las credenciales:$")
    public void lleneCorrectamenteLasCredenciales(List<FormularioLogin> datos) {
        theActorInTheSpotlight().attemptsTo(LoginTask.interaction(datos));
                   }

    @Entonces("^se debe verificar que el usuario se loguee correctamente y sea dirigido a la página de inicio de Fusdec$")
    public void seDebeVerificarQueElUsuarioSeLogueeCorrectamenteYSeaDirigidoALaPáginaDeInicioDeFusdec() {
        theActorInTheSpotlight().should(seeThat(ValidacionLoginA.validacionLogin()));
    }


}
