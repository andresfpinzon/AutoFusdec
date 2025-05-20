package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.tasks.AbrirPaginaFusdec;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Fusdec$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeFusdec() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaFusdec.laPagina());
    }


    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(DataTable arg1) {

    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a la pagina de inicio de Fusdec$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoALaPaginaDeInicioDeFusdec() {

    }
}
