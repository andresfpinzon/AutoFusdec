package co.com.AutoFusdec.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.AutoFusdec.userinterface.pageLogin.AutenticacionFusdec.MENU_PRINCIPAL;
import static jxl.biff.FormatRecord.logger;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionLogin implements Question<Boolean> {


    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            WaitUntil.the(MENU_PRINCIPAL, isVisible()).forNoMoreThan(20).seconds();
            logger.info("El boton de menu es visible.");
            return WebElementQuestion.the(MENU_PRINCIPAL).answeredBy(actor).isVisible();
        } catch (Exception e) {
            logger.error("No se encontro el boton de menu o hubo un error.");
            return false;
        }
    }
}
