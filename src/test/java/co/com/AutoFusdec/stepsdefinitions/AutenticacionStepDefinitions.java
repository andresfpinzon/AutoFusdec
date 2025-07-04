package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.autenticacion.AutenticacionModel;
import co.com.AutoFusdec.questions.login.ValidacionLogin;
import co.com.AutoFusdec.tasks.AbrirPaginaFusdec;
import co.com.AutoFusdec.tasks.autenticacion.AutenticacionTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AutenticacionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Fusdec$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeFusdec() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaFusdec.laPagina());
    }

    @Cuando("^ingrese las credenciales correctas \\(correo y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasCorreoYContrasena(List<AutenticacionModel> credeciales) {
        theActorInTheSpotlight().attemptsTo(AutenticacionTask.interaction(credeciales));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a la pagina de inicio de Fusdec$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoALaPaginaDeInicioDeFusdec() {
        theActorInTheSpotlight().should(seeThat(ValidacionLogin.validacionLogin()));
    }
}
