package co.com.AutoFusdec.questions.curso;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutoFusdec.userinterface.curso.CrearCurso.MENSAJE_EXITO;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearCurso implements Question<Boolean> {

    public static ValidacionCrearCurso validacionCrearCurso() {
        return new ValidacionCrearCurso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_EXITO).viewedBy(actor).asString();
            return "Curso creado correctamente".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }

}
