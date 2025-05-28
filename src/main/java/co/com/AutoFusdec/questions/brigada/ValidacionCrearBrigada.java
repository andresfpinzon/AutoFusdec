package co.com.AutoFusdec.questions.brigada;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.MENSAJE_EXITOSO_BRIGADA;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearBrigada implements Question<Boolean> {
    public static ValidacionCrearBrigada creado(){
        return new ValidacionCrearBrigada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_EXITOSO_BRIGADA).viewedBy(actor).asString();
            return "Brigada creada correctamente".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
