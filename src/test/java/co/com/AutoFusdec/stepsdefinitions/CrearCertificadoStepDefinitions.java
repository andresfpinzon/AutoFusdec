package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.certificado.CertificadoModel;
import co.com.AutoFusdec.questions.CertificadoCreado.CertificadoCreado;
import co.com.AutoFusdec.tasks.certificado.CreacionCertificado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CrearCertificadoStepDefinitions {


    @Cuando("^este en la pagina de certificados y seleccione correctamente todos los campos:$")
    public void esteEnLaPaginaDeCertificadosYSeleccioneCorrectamenteTodosLosCampos(List<CertificadoModel> certificados) {
        theActorInTheSpotlight().attemptsTo(CreacionCertificado.interaction(certificados));
    }

    @Entonces("^se debe verificar que el certificado se cree correctamente$")
    public void seDebeVerificarQueElCertificadoSeCreeCorrectamente() {
        theActorInTheSpotlight().should(seeThat(CertificadoCreado.estaCreado(), equalTo(true)));
    }

}