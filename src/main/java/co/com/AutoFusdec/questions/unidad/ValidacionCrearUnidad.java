package co.com.AutoFusdec.questions.unidad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.*;

public class ValidacionCrearUnidad implements Question<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionCrearUnidad.class);

    public static ValidacionCrearUnidad validacionCompleta() {
        return new ValidacionCrearUnidad();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            // Validar mensaje de éxito
            String mensajeExito = Text.of(MESSAGE_SUCCESFULLY_UNIDAD)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            boolean mensajeExitoValido = mensajeExito.contains("Unidad creada correctamente");

            // Validar nombre de unidad en tabla
            String nombreUnidad = Text.of(TXT_VALIDATION_UNIDAD)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            boolean nombreUnidadValido = nombreUnidad.contains("unidad doña juana 1");

            LOGGER.info("Validaciones - Mensaje éxito: {}, Nombre unidad: {}",
                    mensajeExito, nombreUnidad);

            return mensajeExitoValido && nombreUnidadValido;

        } catch (Exception e) {
            LOGGER.error("Error en validación de creación de unidad", e);
            return false;
        }
    }
}