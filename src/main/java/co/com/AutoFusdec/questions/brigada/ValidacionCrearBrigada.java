package co.com.AutoFusdec.questions.brigada;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.ValidarTexto;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.*;
import static jxl.biff.FormatRecord.logger;
public class ValidacionCrearBrigada implements Question<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionCrearBrigada.class);

    public static ValidacionCrearBrigada validacionCompleta() {
        return new ValidacionCrearBrigada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String validacion = actor.recall(SessionVariables.NombreBrigda.toString());


            actor.attemptsTo(
                    LlenarFiltro.con(INPUT_BUSCAR_BRIGADA, validacion)
            );

            boolean validacionConfirmada = ValidarTexto.en(TXT_VALIDACION, validacion).answeredBy(actor);


            if (validacionConfirmada) {
                logger.info("El nombre de la brigada se ingreso correctamente");
            } else {
                logger.error("El nombre de la brigada no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(INPUT_BUSCAR_BRIGADA)
            );


            if (validacionConfirmada){
                return true;
            }else {
                return false;
            }

        } catch (Exception e) {
            LOGGER.error("Error en validación de creación de brigada", e);
            return false;
        }
    }
}