package co.com.AutoFusdec.questions.usuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutoFusdec.userinterface.usuario.CrearUsuario.MENSAJE_EXITO;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearUsuario implements Question<Boolean> {

    public static ValidacionCrearUsuario validacionCrearUsuario() {
        return new ValidacionCrearUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_EXITO).viewedBy(actor).asString();
            return "Usuario creado correctamente con sus roles".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }

}
