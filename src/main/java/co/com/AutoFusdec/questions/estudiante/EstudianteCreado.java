package co.com.AutoFusdec.questions.estudiante;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.MensajeExito;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.questions.usogeneral.ValidarDatosRegistro;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.comando.CrearComando.BUSQUEDA_COMANDOS;
import static co.com.AutoFusdec.userinterface.comando.CrearComando.PAGINACION_COMANDOS;
import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.*;
import static jxl.biff.FormatRecord.logger;

public class EstudianteCreado implements Question<Boolean> {

    public static Question<Boolean> seCreo(){
        return new EstudianteCreado();
    }
    @Override
    public Boolean answeredBy(Actor actor){
        try{
            String filtro = actor.recall(SessionVariables.NumeroDocumento.toString());
            String filtro2 = actor.recall(SessionVariables.NombreEstudiante.toString());
            String filtro3 = actor.recall(SessionVariables.ApellidoEstudiante.toString());

            String mensaje = "Estudiante creado correctamente";

            boolean mensajeExito = MensajeExito.seVe(MENSAJE_EXITO_ESTUDIANTE,mensaje).answeredBy(actor);

            if (mensajeExito) {
                logger.info("El Mensaje de exito es visible");
            } else {
                logger.error("El Mensaje de exito no es visible");
            }

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_ESTUDIANTES, filtro)
            );

            boolean numeroValido = ValidarDatosRegistro.en(ELEMENTO_LISTA_DOCUMENTO,filtro).answeredBy(actor);

            if (numeroValido) {
                logger.info("El numero de documento se ingreso correctamente");
            } else {
                logger.error("El el numero de documento no se ingreso correctamente");
            }

            boolean nombreValido = ValidarDatosRegistro.en(ELEMENTO_LISTA_NOMBRE,filtro2).answeredBy(actor);

            if (nombreValido) {
                logger.info("El nombre del estudiante se ingreso correctamente");
            } else {
                logger.error("El nombre del estudiante no se ingreso correctamente");
            }

            boolean apellidoValido = ValidarDatosRegistro.en(ELEMENTO_LISTA_APELLIDO,filtro3).answeredBy(actor);

            if (apellidoValido) {
                logger.info("El apellido del estudiante se ingreso correctamente");
            } else {
                logger.error("El apellido del estudiante no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_ESTUDIANTES)
            );

            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_ESTUDIANTES).answeredBy(actor);

            if (numeroValido && nombreValido && registroCreado && apellidoValido && mensajeExito){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            logger.error("Error Verificando si se creo el estudiante", e);
            return false;

        }
    }

}
