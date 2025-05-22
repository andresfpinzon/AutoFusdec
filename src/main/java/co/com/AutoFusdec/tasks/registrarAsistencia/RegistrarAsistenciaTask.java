package co.com.AutoFusdec.tasks.registrarAsistencia;

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



        try {
            // Hacer clic en el menú desplegable, después de asegurarse que está visible
            actor.attemptsTo(
                    WaitUntil.the(MENU_DESPLEGABLE, isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(MENU_DESPLEGABLE)
            );

            Thread.sleep(2000);


            actor.attemptsTo(
                    WaitUntil.the(PAGE_ASISTENCIA, isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(PAGE_ASISTENCIA)
            );


            actor.attemptsTo(
                    Enter.theValue(numeroDocumento).into(INPUT_ESTUDIANTE),
                    Click.on(CHECKBOX_ASISTENCIA),
                    Click.on(BTN_GUARDAR_ASISTENCIA)
            );
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException("Error al realizar las acciones de registro de asistencia", e);
        }

    }


    public static RegistrarAsistenciaTask conDocumento(String numeroDocumento) {
        return new RegistrarAsistenciaTask(numeroDocumento);
    }
}
