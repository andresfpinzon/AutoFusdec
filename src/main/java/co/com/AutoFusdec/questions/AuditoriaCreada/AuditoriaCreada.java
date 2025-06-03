package co.com.AutoFusdec.questions.AuditoriaCreada;

import co.com.AutoFusdec.userinterface.PageAuditoria.VerAuditoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static jxl.biff.FormatRecord.logger;

public class AuditoriaCreada implements Question<Boolean> {

    private static final String DETALLES_AUDITORIA = "Detalles de la Auditoría #20";

    public static AuditoriaCreada estaCreada() {
        return new AuditoriaCreada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEsperado = "Detalles de la Auditoría #20";
        String mensajeRecibido = Text.of(VerAuditoria.DETALLES_AUDITORIA).viewedBy(actor).asString().trim();

        if (mensajeEsperado.equals(mensajeRecibido)) {
            logger.info("El mensaje coincide: " + mensajeRecibido);
            return true;
        } else {
            logger.info("El mensaje no coincide. Esperado: " + mensajeEsperado + ", Recibido: " + mensajeRecibido);
            return false;
        }
    }
}