package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.auditoria.AuditoriaModel;
import co.com.AutoFusdec.questions.AuditoriaCreada.AuditoriaCreada;
import co.com.AutoFusdec.tasks.auditoria.VisualizarAuditoria;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class VisualizarAuditoriaStepDefinitions {


    @Cuando("^esté en la página de auditorías y seleccione correctamente todos los campos$")
    public void estéEnLaPáginaDeAuditoríasYSeleccioneCorrectamenteTodosLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                VisualizarAuditoria.interaction(List.of(new AuditoriaModel()))
        );
    }

    @Entonces("^visualizará los detalles de una la auditoría del certificados$")
    public void visualizaráLosDetallesDeUnaLaAuditoríaDelCertificados() {
        theActorInTheSpotlight().should(seeThat(AuditoriaCreada.estaCreada(), equalTo(true)));
    }
}