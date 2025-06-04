package co.com.AutoFusdec.tasks.registrarAsistencia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FormAsistence implements Task {
    private final String numeroDocumento;

    public FormAsistence(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public  <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
