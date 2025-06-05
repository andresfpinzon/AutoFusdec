package co.com.AutoFusdec.questions.registrarAsistencia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFusdec.userinterface.registroAsistencia.RegistrarAsistencia.NUMERO_VALIDACION;

public class ValidacionRegistroAsistencia implements Question<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionRegistroAsistencia.class);
    private final String documentoEsperado;

    public ValidacionRegistroAsistencia(String documentoEsperado) {
        this.documentoEsperado = documentoEsperado;
    }

    public static ValidacionRegistroAsistencia conDocumento(String documentoEsperado) {
        return new ValidacionRegistroAsistencia(documentoEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String documentoEncontrado = Text.of(NUMERO_VALIDACION)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            LOGGER.info("Validando documento - Esperado: {} | Encontrado: {}",
                    documentoEsperado, documentoEncontrado);

            return documentoEsperado.equals(documentoEncontrado);
        } catch (Exception e) {
            LOGGER.error("Error al validar el registro de asistencia", e);
            return false;
        }
    }
}