package co.com.AutoFusdec.questions.registrarAsistencia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutoFusdec.userinterface.registroAsistencia.RegistrarAsistencia.MENSAJE_REGISTRO_EXITOSO;
import static jxl.biff.FormatRecord.logger;

public class ValidacionRegistroAsistencia implements Question<Boolean> {

    public static ValidacionRegistroAsistencia validacionRegistroAsistencia(){
        return new ValidacionRegistroAsistencia();
    }

    @Override
    public Boolean answeredBy(Actor actor){
        try{
            String txt = Text.of(MENSAJE_REGISTRO_EXITOSO).viewedBy(actor).asString();
            return "Asistencia registrada correctamente".equals(txt);
        }catch (Exception e){
            logger.info("No encontro el contenido o hubo un error");
            return  false;
        }
    }

}
