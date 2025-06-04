package co.com.AutoFusdec.questions.usogeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static jxl.biff.FormatRecord.logger;
public class RegistroEliminado implements Question<Boolean> {

    private final Target paginacion;

    public RegistroEliminado(Target paginacion) {
        this.paginacion = paginacion;
    }

    public static Question<Boolean> enTabla(Target paginacion) {
        return new RegistroEliminado(paginacion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String textoInicial = actor.recall("paginacion_despues_crear");
            String textoActual = Text.of(paginacion).viewedBy(actor).asString().trim();

            int totalInicial = obtenerTotal(textoInicial);
            int totalActual = obtenerTotal(textoActual);

            logger.info("Paginación actual después de eliminar: " + totalActual);
            return totalActual < totalInicial;

        } catch (Exception e) {
            logger.error("Error verificando si se eliminó el registro", e);
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

