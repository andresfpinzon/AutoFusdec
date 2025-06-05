package co.com.AutoFusdec.questions.unidad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.MESSAGE_SUCCESFULLY_UNIDAD;
import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.TXT_VALIDATION_UNIDAD;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearUnidad implements Question<Boolean> {

    public static ValidacionCrearUnidad creado(){
        return  new ValidacionCrearUnidad();
    }

    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(TXT_VALIDATION_UNIDAD).viewedBy(actor).asString();
            return "unidad doña juana 1".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
