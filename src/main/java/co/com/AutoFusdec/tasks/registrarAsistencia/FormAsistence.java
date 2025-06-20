package co.com.AutoFusdec.tasks.registrarAsistencia;

import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoFusdec.userinterface.registroAsistencia.RegistrarAsistencia.*;
import static co.com.AutoFusdec.userinterface.registroAsistencia.RegistrarAsistencia.BTN_GUARDAR_ASISTENCIA;

public class FormAsistence implements Task {
    private final String numeroDocumento;

    public FormAsistence(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public static FormAsistence with(String numeroDocumento){
        return new FormAsistence(numeroDocumento);
    }
    @Override
    public  <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(numeroDocumento).into(INPUT_ESTUDIANTE),
                Click.on(CHECKBOX_ASISTENCIA),
                Click.on(BTN_GUARDAR_ASISTENCIA),
                Click.on(BTN_HISTORIAL),
                Click.on(BTN_DETALLES_HISTORIAL),
                Enter.theValue(numeroDocumento).into(INPUT_IDENTIFICACION_VALIDACION),
                Esperar.forSeconds(4)

        );
    }
}
