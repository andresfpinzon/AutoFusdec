package co.com.AutoFusdec.questions.usogeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static jxl.biff.FormatRecord.logger;

public class RegistroCreado implements Question<Boolean> {

    private final Target paginacion;

    public RegistroCreado(Target paginacion) {
        this.paginacion = paginacion;
    }

    public static Question<Boolean> enTabla(Target paginacion) {
        return new RegistroCreado(paginacion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String textoInicial = actor.recall("paginacion_inicial");
            String textoActual = Text.of(paginacion).viewedBy(actor).asString().trim();

            int totalInicial = obtenerTotal(textoInicial);
            int totalActual = obtenerTotal(textoActual);

            if (totalActual > totalInicial) {
                logger.info("El registro se creo correctamente.La paginacion aumento.");
                logger.info("Total registros iniciales: " + totalInicial);
                logger.info("Total registros actuales: " + totalActual);
                return true;
            } else {
                logger.error("El registro no se creo. La paginacion no cambio.");
                logger.info("Total registros iniciales: " + totalInicial);
                logger.info("Total registros actuales: " + totalActual);
                return false;
            }

        } catch (Exception e) {
            logger.error("Error verificando si se creo el registro", e);
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
