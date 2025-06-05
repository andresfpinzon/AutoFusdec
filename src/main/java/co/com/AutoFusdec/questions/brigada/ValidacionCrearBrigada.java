package co.com.AutoFusdec.questions.brigada;

import co.com.AutoFusdec.questions.registrarAsistencia.ValidacionRegistroAsistencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.MENSAJE_EXITOSO_BRIGADA;
import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.TXT_VALIDACION;
import static jxl.biff.FormatRecord.logger;

public class ValidacionCrearBrigada implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidacionRegistroAsistencia.class);


    public static ValidacionCrearBrigada validacionCrearBrigada(){
        return new ValidacionCrearBrigada();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(TXT_VALIDACION).viewedBy(actor).asString();
            return "brigada doña juana".equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
