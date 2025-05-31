package co.com.AutoFusdec.questions.usogeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static jxl.biff.FormatRecord.logger;

public class ValidarDatosRegistro implements Question<Boolean> {

    private final Target elementoLista;

    public ValidarDatosRegistro(Target elementoLista) {
        this.elementoLista = elementoLista;
    }

    public static ValidarDatosRegistro en(Target elementoLista) {
        return new ValidarDatosRegistro(elementoLista);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String datofiltro = actor.recall("datoFiltro");

        if (datofiltro == null) {
            logger.warn("datoFiltro no se encontró en la memoria del actor");
            return false;
        }

        try {
            String texto = Text.of(elementoLista).viewedBy(actor).asString();
            if (datofiltro.equals(texto)){
                return true;
            }else{
                return false;
            }

        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }
}
