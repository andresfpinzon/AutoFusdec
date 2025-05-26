package co.com.AutoFusdec.questions.estudiante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static jxl.biff.FormatRecord.logger;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.PAGINACION_ESTUDIANTES;


public class EstudianteCreado implements Question<Boolean> {



    public static Question<Boolean> estaCreado() {
        return new EstudianteCreado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String textoInicial = actor.recall("paginacion_inicial");
            String textoActual = Text.of(PAGINACION_ESTUDIANTES).viewedBy(actor).asString().trim();

            int totalInicial = obtenerTotal(textoInicial);
            int totalActual = obtenerTotal(textoActual);

            logger.info("El estudiante se creo correctamente dado que la paginacion en la tabla se modifico" );
            logger.info("Total registros iniciales: " + totalInicial);
            logger.info("Total registros actuales: " + totalActual);

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
            logger.error("No se pudo extraer el total del texto: " + texto, e);
        }
        return -1;
    }
}


