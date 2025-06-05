package co.com.AutoFusdec.tasks.usogeneral;

import co.com.AutoFusdec.tasks.waitTask.Esperar;
import co.com.AutoFusdec.userinterface.interfaz.InterfazUsuario;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionDelMenu implements Task {

    private final Target opcion;

    public SeleccionarOpcionDelMenu(Target opcion) {
        this.opcion = opcion;
    }

    public static SeleccionarOpcionDelMenu en(Target opcion) {
        return instrumented(SeleccionarOpcionDelMenu.class, opcion);
    }

    public static SeleccionarOpcionDelMenu conOpcion(Target opcion) {
        return en(opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.forElement(InterfazUsuario.MENU_DRAWER),
                Click.on(InterfazUsuario.MENU_DRAWER),
                Esperar.forElement(opcion),
                Click.on(opcion)
        );
    }
}


