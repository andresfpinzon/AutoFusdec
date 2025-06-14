package co.com.AutoFusdec.questions.unidad;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.ValidarTexto;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.*;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearUnidad implements Question<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionCrearUnidad.class);

    public static ValidacionCrearUnidad validacionCompleta() {
        return new ValidacionCrearUnidad();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String validacion = actor.recall(SessionVariables.NombreUnidad.toString());

            actor.attemptsTo(
                    LlenarFiltro.con(INPUT_SEARCH_UNIDAD, validacion)
            );

            boolean validacionConfirmada = ValidarTexto.en(TXT_VALIDATION_UNIDAD, validacion).answeredBy(actor);


            if (validacionConfirmada) {
                logger.info("El nombre de la unidad se ingreso correctamente");
            } else {
                logger.error("El nombre de la unidad no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(INPUT_SEARCH_UNIDAD)
            );


            if (validacionConfirmada){
                return true;
            }else {
                return false;
            }


        } catch (Exception e) {
            LOGGER.error("Error en validación de creación de unidad", e);
            return false;
        }
    }
}