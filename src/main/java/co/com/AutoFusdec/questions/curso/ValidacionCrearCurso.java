package co.com.AutoFusdec.questions.curso;

import co.com.AutoFusdec.questions.usogeneral.ValidarTexto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.curso.CrearCurso.MENSAJE_EXITO;
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
                return true;
            }else {
                return false;
            }

            // aquí



        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }

}
