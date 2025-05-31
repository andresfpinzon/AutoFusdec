package co.com.AutoFusdec.questions.estudiante;

import co.com.AutoFusdec.questions.usogeneral.RegistroEliminado;
import co.com.AutoFusdec.tasks.usogeneral.EliminarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.*;
import static jxl.biff.FormatRecord.logger;



public class EstudianteEliminado implements Question<Boolean> {


    public static Question<Boolean> seElimino() {
        return new EstudianteEliminado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            actor.attemptsTo(
                    EliminarRegistro.con(
                            BUSQUEDA_ESTUDIANTES,
                            BTN_ELIMINAR_ESTUDIANTE,
                            BTN_CONFIRMAR_ELIMINAR_ESTUDIANTE,
                            PAGINACION_ESTUDIANTES
                    )
            );

            boolean resultado = RegistroEliminado.enTabla(PAGINACION_ESTUDIANTES).answeredBy(actor);

            if (resultado) {
                logger.info("El estudiante fue eliminado correctamente.");
            } else {
                logger.error("No se pudo eliminar el estudiante.");
            }
            return resultado;

        } catch (Exception e) {
            logger.error("Error verificando si se elimino el estudiante", e);
            return false;
        }

    }

}
