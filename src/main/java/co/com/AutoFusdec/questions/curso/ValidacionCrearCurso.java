package co.com.AutoFusdec.questions.curso;


import co.com.AutoFusdec.questions.usogeneral.ValidarTexto;
import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.curso.CrearCurso.*;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearCurso implements Question<Boolean> {

    public static ValidacionCrearCurso validacionCrearCurso() {
        return new ValidacionCrearCurso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = "Curso creado correctamente";
            boolean confirmacion = ValidarTexto.en(MENSAJE_EXITO, texto).answeredBy(actor);
            if (confirmacion){
                logger.info("El mensaje de exito es correcto");
            } else {
                logger.error("El mensaje de extio no es correcto");
            }

            String nombre = actor.recall(SessionVariables.NombreCurso.toString());

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_CURSOS, nombre)
            );

            boolean nombreValido = ValidarTexto.en(ELEMENTO_LISTA_NOMBRE, nombre).answeredBy(actor);

            if (nombreValido) {
                logger.info("El nombre del curso se ingreso correctamente");
            } else {
                logger.error("El nombre del curso no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_CURSOS)
            );

            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_CURSOS).answeredBy(actor);

            if (confirmacion && nombreValido && registroCreado){
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
