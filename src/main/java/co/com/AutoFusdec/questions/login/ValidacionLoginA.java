package co.com.AutoFusdec.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.AutoFusdec.userinterface.login.Login.MENU_DESPEGABLE;
import static jxl.biff.FormatRecord.logger;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionLogin implements Question<Boolean> {

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            try {
                WaitUntil.the(MENU_DESPEGABLE, isVisible()).forNoMoreThan(20).seconds();
                return WebElementQuestion.the(MENU_DESPEGABLE).answeredBy(actor).isVisible();
        } catch (Exception e) {
            logger.info(" No encontró el texto o hubo otro error");
            return false;
        }
    }

}

