package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.usuario.FormularioUsuario;
import co.com.AutoFusdec.questions.usuario.ValidacionCrearUsuario;
import co.com.AutoFusdec.tasks.usuario.CreacionUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuarioStepDefinitions {

    /*@Cuando("^este en la pagina de usuarios diligenciar correctamente el formulario y dar clic a crear usuario:$")
    public void esteEnLaPaginaDeUsuariosDiligenciarCorrectamenteElFormularioYDarClicACrearUsuario( List<FormularioUsuario> usuario ) {

        theActorInTheSpotlight().attemptsTo(CreacionUsuario.aute(usuario));

    }


    @Entonces("^se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios\\.$")
    public void seDebeVerificarQueElUsuarioSeCreeCorrectamenteYSeAgregueALaListaDeUsuarios() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearUsuario.validacionCrearUsuario()));
    }*/

}
