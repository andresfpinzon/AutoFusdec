package co.com.AutoFusdec.tasks.certificado;

import co.com.AutoFusdec.models.certificado.CertificadoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;

import static co.com.AutoFusdec.userinterface.PageCertificado.CrearCertificado.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionCertificado implements Task {

    private final List<CertificadoModel> certificados;

    public CreacionCertificado(List<CertificadoModel> certificados) {
        this.certificados = certificados;
    }

    public static CreacionCertificado interaction(List<CertificadoModel> certificados) {
        return new CreacionCertificado(certificados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CertificadoModel certificado = certificados.get(0);

        actor.attemptsTo(
                // Abrir el menú principal
                Click.on(MENU_DRAWER),
                Click.on(MENU_DRAWER_OPCION_CERTIFICADOS),

                // SELECT DE ESTUADIANTE
                WaitUntil.the(DROPDOWN_ESTUDIANTE, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(DROPDOWN_ESTUDIANTE),
                Click.on(DROPDOWN_ESTUDIANTE),
                WaitUntil.the(OPCION_ESTUDIANTE, isVisible()).forNoMoreThan(10).seconds(),
                GuardarTextoCertificado.de("nombre_certificado", ESTUDIANTE_SELECCIONADO),
                Click.on(OPCION_ESTUDIANTE),

                // Select DE HORAS COMPLETADAS
                WaitUntil.the(DROPDOWN_HORAS, isClickable()).forNoMoreThan(10).seconds(),
                Scroll.to(DROPDOWN_HORAS),
                Click.on(DROPDOWN_HORAS),
                WaitUntil.the(OPCION_HORAS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_HORAS),

                // FECHA DE EMISION
                WaitUntil.the(DROPDOWN_FECHA, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(DROPDOWN_FECHA),
                Enter.theValue(certificados.get(0).getFechaEmision()).into(DROPDOWN_FECHA),

                // Generar certificado
                WaitUntil.the(BTN_GENERAR, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(BTN_GENERAR),
                Click.on(BTN_GENERAR),

                // validación de éxito
                WaitUntil.the(ALERT_SUCCESS, isVisible()).forNoMoreThan(10).seconds()

        );
    }
}