package co.com.AutoFusdec.questions.usuario;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.ValidarTexto;
import co.com.AutoFusdec.questions.usogeneral.RegistroCreado;
import co.com.AutoFusdec.tasks.usogeneral.LimpiarFiltro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import co.com.AutoFusdec.userinterface.usuario.CrearUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.usuario.CrearUsuario.*;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearUsuario implements Question<Boolean> {

    public static ValidacionCrearUsuario validacionCrearUsuario() {
        return new ValidacionCrearUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = "Usuario creado correctamente con sus roles";
            String documento = actor.recall(SessionVariables.DocumentoUsuario.toString());
            String nombre = actor.recall(SessionVariables.NombreUsuario.toString());
            String apellido = actor.recall(SessionVariables.ApellidoUsuario.toString());
            String correo = actor.recall(SessionVariables.CorreoUsuario.toString());


            boolean confirmacion = ValidarTexto.en(CrearUsuario.MENSAJE_EXITO, texto).answeredBy(actor);

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_USUARIOS, documento)
            );

            boolean documentoValido = ValidarTexto.en(ELEMENTO_LISTA_DOCUMENTO, documento).answeredBy(actor);

            if (documentoValido) {
                logger.info("El documento del usuario se ingreso correctamente");
            } else {
                logger.error("El documento del usuario no se ingreso correctamente");
            }

            boolean nombreValido = ValidarTexto.en(ELEMENTO_LISTA_NOMBRE, nombre).answeredBy(actor);

            if (nombreValido) {
                logger.info("El nombre del usuario se ingreso correctamente");
            } else {
                logger.error("El nombre del usuario no se ingreso correctamente");
            }

            boolean apellidoValido = ValidarTexto.en(ELEMENTO_LISTA_APELLIDO, apellido).answeredBy(actor);

            if (apellidoValido) {
                logger.info("El apellido del usuario se ingreso correctamente");
            } else {
                logger.error("El apellido del usuario no se ingreso correctamente");
            }

            boolean correoValido = ValidarTexto.en(ELEMENTO_LISTA_CORREO, correo).answeredBy(actor);

            if (correoValido) {
                logger.info("El correo del usuario se ingreso correctamente");
            } else {
                logger.error("El correo del usuario no se ingreso correctamente");
            }

            actor.attemptsTo(
                    LimpiarFiltro.con(BUSQUEDA_USUARIOS)
            );

            boolean registroCreado = RegistroCreado.enTabla(PAGINACION_USUARIO).answeredBy(actor);

            if (confirmacion &&  documentoValido  && nombreValido && apellidoValido && correoValido && registroCreado){
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
