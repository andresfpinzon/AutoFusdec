package co.com.AutoFusdec.questions.estudiante;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
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

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_ESTUDIANTES, filtro)
            );

            boolean numeroValido = ValidarDatosRegistro.en(ELEMENTO_LISTA_DOCUMENTO,filtro).answeredBy(actor);

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_COMANDOS)
            );

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_ESTUDIANTES, filtro2)
            );

            boolean nombreValido = ValidarDatosRegistro.en(ELEMENTO_LISTA_NOMBRE,filtro2).answeredBy(actor);

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_COMANDOS)
            );

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_ESTUDIANTES, filtro3)
            );

            boolean apellidoValido = ValidarDatosRegistro.en(ELEMENTO_LISTA_APELLIDO,filtro3).answeredBy(actor);

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_COMANDOS)
            );

            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_ESTUDIANTES).answeredBy(actor);
            if (numeroValido && nombreValido && registroCreado && apellidoValido){
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
