package co.com.AutoFusdec.questions.brigada;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.*;

public class ValidacionCrearBrigada implements Question<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionCrearBrigada.class);

    // Textos esperados (pueden ser parámetros si lo prefieres)
    private static final String TEXTO_ESPERADO_BRIGADA = "brigada doña juana";
    private static final String MENSAJE_EXITO_ESPERADO = "Brigada creada correctamente";

    public static ValidacionCrearBrigada validacionCompleta() {
        return new ValidacionCrearBrigada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            // Validar mensaje de éxito
            String mensajeExito = Text.of(MENSAJE_EXITOSO_BRIGADA)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            boolean mensajeExitoValido = MENSAJE_EXITO_ESPERADO.equalsIgnoreCase(mensajeExito);

            // Validar nombre de brigada en tabla
            String nombreBrigada = Text.of(TXT_VALIDACION)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            boolean nombreBrigadaValido = TEXTO_ESPERADO_BRIGADA.equalsIgnoreCase(nombreBrigada);

            LOGGER.info("Validaciones - Mensaje éxito: {} ({}), Nombre brigada: {} ({})",
                    mensajeExito, mensajeExitoValido,
                    nombreBrigada, nombreBrigadaValido);

            return mensajeExitoValido && nombreBrigadaValido;

        } catch (Exception e) {
            LOGGER.error("Error en validación de creación de brigada", e);
            return false;
        }
    }
}