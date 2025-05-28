package co.com.AutoFusdec.tasks.unidad;

import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.*;

public class CrearUnidadTask implements Task {
    private final String nombre;

    public CrearUnidadTask(String nombre) {
        this.nombre = nombre;
    }

    public static CrearUnidadTask intoName(String nombre){
        return new CrearUnidadTask(nombre);
    }

    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Esperar.forElement(MENU_LATERAL_UNIDAD),
                Click.on(MENU_LATERAL_UNIDAD),
                Click.on(BTN_UNIDAD),
                Esperar.forElement(PAGE_UNIDAD),
                Click.on(BNT_AGREGAR_UNIDAD),
                Esperar.forElement(POPPUP_CREAR_UNIDAD),
                Enter.theValue(nombre).into(INPUT_NOMBRE_UNIDAD),
                Click.on(SELECT_BRIGADA),
                Click.on(OPTION_BRIGADA),
                Click.on(SELECT_USER),
                Click.on(OPTION_USER),
                Click.on(BTN_CONFIRMAR_UNIDAD)
        );
    }
}
