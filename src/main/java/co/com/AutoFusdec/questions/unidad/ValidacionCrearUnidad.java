package co.com.AutoFusdec.questions.unidad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.MESSAGE_SUCCESFULLY_UNIDAD;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearUnidad implements Question<Boolean> {

    public static ValidacionCrearUnidad creado(){
        return  new ValidacionCrearUnidad();
    }

    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MESSAGE_SUCCESFULLY_UNIDAD).viewedBy(actor).asString();
            return "Unidad creada correctamente".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
