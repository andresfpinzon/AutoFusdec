package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.tasks.AbrirPagina;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuarioStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Facebook$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeFacebook() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());

    }

    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(DataTable arg1) {

    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de Facebook$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeInicioDeFacebook() {

    }@Dado("^que el usuario se encuentra autenticado$")
    public void queElUsuarioSeEncuentraAutenticado() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Cuando("^este en la pagina de usuarios diligenciar correctamente el formulario:$")
    public void esteEnLaPaginaDeUsuariosDiligenciarCorrectamenteElFormulario(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios\\.$")
    public void seDebeVerificarQueElUsuarioSeCreeCorrectamenteYSeAgregueALaListaDeUsuarios() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
