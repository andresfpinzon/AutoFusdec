package co.com.AutoFusdec.stepsdefinitions.stepsBrigada;

import co.com.AutoFusdec.models.brigadamodel.BrigadaModel;
import co.com.AutoFusdec.questions.brigada.ValidacionCrearBrigada;
import co.com.AutoFusdec.tasks.brigada.CrearBrigadaTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearBrigadaStepDefinitions {

    @Cuando("^estoy en la página de gestión de brigadas dar click en agregar, llenar campos y confirmar$")
    public void estoyEnLaPáginaDeGestiónDeBrigadasDarClickEnAgregarLlenarCamposYConfirmar(List<BrigadaModel> datos) {
        theActorInTheSpotlight().attemptsTo(CrearBrigadaTask.ingresarDatosBrigada(datos));
    }


    @Entonces("^se debe verificar que la brigada se creo correctamente ingresando en el buscador el nombre de la brigada$")
    public void seDebeVerificarQueLaBrigadaSeCreoCorrectamenteIngresandoEnElBuscadorElNombreDeLaBrigada() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearBrigada.validacionCrearBrigada()));
    }

}
