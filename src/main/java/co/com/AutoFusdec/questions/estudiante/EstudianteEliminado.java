package co.com.AutoFusdec.questions.estudiante;

import co.com.AutoFusdec.models.estudiante.FormularioEstudiante;
import co.com.AutoFusdec.questions.usogeneral.RegistroEliminado;
import co.com.AutoFusdec.tasks.usogeneral.EliminarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.*;
import static jxl.biff.FormatRecord.logger;



public class EstudianteEliminado implements Question<Boolean> {

    List<FormularioEstudiante> datosEstudiante;

    public EstudianteEliminado(List<FormularioEstudiante> datosEstudiante) {
        this.datosEstudiante = datosEstudiante;
    }

    public static Question<Boolean> conDatos(List<FormularioEstudiante> datosEstudiante) {
        return new EstudianteEliminado(datosEstudiante);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            actor.attemptsTo(
                    EliminarRegistro.con(
                            datosEstudiante,
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
