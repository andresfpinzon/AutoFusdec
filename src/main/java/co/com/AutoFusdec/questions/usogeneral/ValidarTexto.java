package co.com.AutoFusdec.questions.usogeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static jxl.biff.FormatRecord.logger;

public class ValidarTexto implements Question<Boolean> {

    private final Target elementoLista;

    private final String datoFiltro;

    public ValidarTexto(Target elementoLista, String datoFiltro) {

        this.elementoLista = elementoLista;
        this.datoFiltro = datoFiltro;
    }

    public static ValidarTexto en(Target elementoLista, String datoFiltro) {
        return new ValidarTexto(elementoLista, datoFiltro);
    }

    @Override
    public Boolean answeredBy(Actor actor) {



        if (datoFiltro == null) {
            logger.warn("datoFiltro no se encontró en la memoria del actor");
            return false;
        }

        try {
            String texto = Text.of(elementoLista).viewedBy(actor).asString();
            if (datoFiltro.equals(texto)){
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
