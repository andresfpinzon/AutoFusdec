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
                UnidadForm.intoName(nombre)
        );
    }
}
