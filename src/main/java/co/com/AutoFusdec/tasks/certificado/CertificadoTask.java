package co.com.AutoFusdec.tasks.certificado;

import co.com.AutoFusdec.models.certificado.CertificadoModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static co.com.AutoFusdec.userinterface.PageCertificado.PageCertificado.*;

public class CertificadoTask implements Task {

    private List<CertificadoModel> certificados;

    public CertificadoTask(List<CertificadoModel> certificados) { this.certificados = certificados; }

    public static CertificadoTask interaction (List<CertificadoModel> certificados) {
        return Instrumented.instanceOf(CertificadoTask.class).withProperties(certificados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CERTIFICADOS),
                Enter.theValue(certificados.get(0).getEstudianteId()).into(DROPDOWN_ESTUDIANTE),
                Enter.theValue(certificados.get(0).getHorasCompletadas()).into(DROPDOWN_HORAS),
                Enter.theValue(certificados.get(0).getFechaEmision()).into(INPUT_FECHA),
                Click.on(BTN_GENERAR)
        );
    }
}