package co.com.AutoFusdec.tasks.registrarAsistencia;

import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.AutoFusdec.userinterface.registroAsistencia.RegistrarAsistencia.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class RegistrarAsistenciaTask implements Task {

    private final String numeroDocumento;


    public RegistrarAsistenciaTask(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    @Override
    public  <T extends Actor> void performAs(T actor){



            // Hacer clic en el menú desplegable, después de asegurarse que está visible
            actor.attemptsTo(
                    Esperar.forElement(MENU_DESPLEGABLE,15),
                    Click.on(MENU_DESPLEGABLE),
                    Esperar.forElement(PAGE_ASISTENCIA,15),
                    Click.on(PAGE_ASISTENCIA),
                    Enter.theValue(numeroDocumento).into(INPUT_ESTUDIANTE),
                    Click.on(CHECKBOX_ASISTENCIA),
                    Click.on(BTN_GUARDAR_ASISTENCIA)
            );


    }


    public static RegistrarAsistenciaTask conDocumento(String numeroDocumento) {
        return new RegistrarAsistenciaTask(numeroDocumento);
    }
}
