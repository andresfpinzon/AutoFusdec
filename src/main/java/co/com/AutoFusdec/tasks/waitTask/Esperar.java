package co.com.AutoFusdec.tasks.waitTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static jxl.biff.FormatRecord.logger;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Esperar implements Task {
    private final Target target;
    private final int seconds;

    private Esperar(Target target, int seconds) {
        this.target = target;
        this.seconds = seconds;
    }


    public static Esperar forElement(Target target){
        return new Esperar(target, 10);
    }
    // Sobrecarga
    public static Esperar forElement(Target target, int seconds){
        return new Esperar(target, seconds);
    }
    public Esperar forNoMoreThan(int seconds){
        return new Esperar(this.target, seconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
                WaitUntil.the(target,isVisible()).forNoMoreThan(seconds).seconds();
    }

}
