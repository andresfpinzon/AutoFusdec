package co.com.AutoFusdec.questions.estudiante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.PG_ESTUDIANTES;


public class EstudianteCreado implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(EstudianteCreado.class);

    public static Question<Boolean> estaCreado() {
        return new EstudianteCreado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String textoInicial = actor.recall("paginacion_inicial");
            String textoActual = Text.of(PG_ESTUDIANTES).viewedBy(actor).asString().trim();

            int totalInicial = obtenerTotal(textoInicial);
            int totalActual = obtenerTotal(textoActual);

            logger.info("Total anterior: {}", totalInicial);
            logger.info("Total actual: {}", totalActual);

            return totalActual > totalInicial;

        } catch (Exception e) {
            logger.error("Error verificando si se creó el estudiante", e);
            return false;
        }
    }

    private int obtenerTotal(String texto) {
        try {
            String[] partes = texto.split("of");
            if (partes.length == 2) {
                return Integer.parseInt(partes[1].trim());
            }
        } catch (Exception e) {
            logger.error("No se pudo extraer el total del texto: {}", texto, e);
        }
        return -1;
    }
}


