package co.com.AutoFusdec.stepsdefinitions;

import co.com.AutoFusdec.models.certificado.CertificadoModel;
import co.com.AutoFusdec.tasks.AbrirPaginaFusdec;
import co.com.AutoFusdec.tasks.certificado.CertificadoTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearCertificadoStepDefinitions {

    @Dado("^que el usuario se encuentra autenticado en el sistema con los siguientes datos:$")
    public void queElUsuarioSeEncuentraAutenticadoEnElSistemaConLosSiguientesDatos(){
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaFusdec.laPagina());
    }

    @Cuando("^este en la pagina de certificados y seleccione correctamente todos los campos:$")
    public void esteEnLaPaginaDeCertificadosYSeleccioneCorrectamenteTodosLosCampos(List<CertificadoModel> certificados){
        theActorInTheSpotlight().attemptsTo(CertificadoTask.interaction(certificados)
        );
    }

    @Entonces("^se debe verificar que el certificado se cree correctamente$")
    public void seDebeVerificarQueElCertificadoSeCreeCorrectamente() {
        // Add verification logic here
    }
}