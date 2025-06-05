package co.com.AutoFusdec.questions.usogeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.AutoFusdec.userinterface.curso.CrearCurso.MENSAJE_EXITO;
import static jxl.biff.FormatRecord.logger;

public class MensajeExito implements Question<Boolean> {

    private Target mensajeExito;

    private String dato;

    public MensajeExito(Target mensajeExito, String dato) {

        this.mensajeExito = mensajeExito;
        this.dato = dato;
    }


    public static MensajeExito seVe(Target mensajeExito, String dato) {
        return new MensajeExito (mensajeExito, dato);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(mensajeExito).viewedBy(actor).asString();
            String mensaje = dato ;
            return mensaje.equals(texto);
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }

}
