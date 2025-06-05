package co.com.AutoFusdec.questions.comando;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.questions.usogeneral.ValidarDatosRegistro;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.comando.CrearComando.*;
import static jxl.biff.FormatRecord.logger;

public class ComandoCreado implements Question<Boolean> {

    public static Question<Boolean> seCreo(){
        return new ComandoCreado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            String filtro = actor.recall(SessionVariables.NombreComando.toString());
            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_COMANDOS,filtro)
            );

            boolean datosValidos = ValidarDatosRegistro.en(ELEMENTO_LISTA_COMANDO, filtro).answeredBy(actor);

            if (datosValidos) {
                logger.info("Los datos del comando son validos.");
            } else {
                logger.error("El comando no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_COMANDOS)
            );

            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_COMANDOS).answeredBy(actor);

            if (datosValidos && registroCreado){
                return true;
            }else{
                return false;
            }


        } catch (Exception e) {
            logger.error("Error verificando si se creo el comando", e);
            return false;

        }
    }

}



