package co.com.AutoFusdec.questions.CertificadoCreado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static jxl.biff.FormatRecord.logger;

import static co.com.AutoFusdec.userinterface.PageCertificado.CrearCertificado.ALERT_SUCCESS;

public class CertificadoCreado implements Question<Boolean> {

    private static final String MENSAJE_ESPERADO = "Certificado generado exitosamente";

    public static CertificadoCreado estaCreado() {
        return new CertificadoCreado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEsperado = "Certificado generado exitosamente";
        String mensajeRecibido = Text.of(ALERT_SUCCESS).viewedBy(actor).asString().trim();

        if (mensajeEsperado.equals(mensajeRecibido)) {
            logger.info("El mensaje coincide: " + mensajeRecibido);
            return true;
        } else {
            logger.info("El mensaje no coincide. Esperado: " + mensajeEsperado + ", Recibido: " + mensajeRecibido);
            return false;
        }
    }
}