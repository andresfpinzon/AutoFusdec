package co.com.AutoFusdec.questions.edicion;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.questions.usogeneral.ValidarTexto;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.edicion.CrearEdicion.*;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearEdicion implements Question<Boolean> {

    public static ValidacionCrearEdicion validacionCrearEdicion() {
        return new ValidacionCrearEdicion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = "Edición creada correctamente";
            String titulo = actor.recall(SessionVariables.TituloEdicion.toString());
            boolean confirmacion = ValidarTexto.en(MENSAJE_EXITO, texto).answeredBy(actor);

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_EDICIONES, titulo)
            );

            boolean tituloValido = ValidarTexto.en(ELEMENTO_LISTA_TITULO, titulo).answeredBy(actor);

            if (tituloValido) {
                logger.info("El titulo de la edicion se ingreso correctamente");
            } else {
                logger.error("El titulo de la edicion no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_EDICIONES)
            );

            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_EDICIONES).answeredBy(actor);

            if (confirmacion && tituloValido && registroCreado){
                return true;
            }else {
                return false;
            }

        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }

}