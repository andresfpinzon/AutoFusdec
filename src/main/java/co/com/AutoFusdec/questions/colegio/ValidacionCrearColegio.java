package co.com.AutoFusdec.questions.colegio;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.questions.usogeneral.ValidarDatosRegistro;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static jxl.biff.FormatRecord.logger;


import co.com.AutoFusdec.userinterface.colegio.CrearColegio.*;
import org.aspectj.bridge.IMessage;

import static co.com.AutoFusdec.userinterface.colegio.CrearColegio.*;

public class ValidacionCrearColegio implements Question<Boolean> {

    public static Question<Boolean> seCreoColegio() {
        return new ValidacionCrearColegio();
    }


    @Override

    public Boolean answeredBy(Actor actor) {
        try {
            String filtro1 = actor.recall(SessionVariables.NombreColegio.toString());

            actor.attemptsTo(

                    LlenarFiltro.con(IN_BUSCAR_COLEGIO, filtro1)
            );
            boolean nombreColegioValido = ValidarDatosRegistro.en(LISTA_NOMBRE_COLEGIO, filtro1).answeredBy(actor);

            if (nombreColegioValido) {
                logger.info("El nombre se ingreso correctamente");
            } else {
                logger.error("El nombre no fue ingresado correctamente ");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(IN_BUSCAR_COLEGIO)
            );
            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_COLEGIO).answeredBy(actor);

            if (nombreColegioValido && registroCreado) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            logger.error("Error, verufucando que se creo el colegio", e);
            return false;
        }
    }
}





