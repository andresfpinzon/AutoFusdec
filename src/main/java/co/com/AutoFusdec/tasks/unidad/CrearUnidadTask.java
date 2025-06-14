package co.com.AutoFusdec.tasks.unidad;

import co.com.AutoFusdec.models.unidad.UnidadModel;
import co.com.AutoFusdec.tasks.brigada.CrearBrigadaTask;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.*;

public class CrearUnidadTask implements Task {
    private final List<UnidadModel> datos;

    public CrearUnidadTask(List<UnidadModel> datos) {
        this.datos = datos;
    }

    public static CrearUnidadTask intoName(List<UnidadModel> datos) {
        return Instrumented.instanceOf(CrearUnidadTask.class).withProperties(datos);
    }
    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                UnidadForm.intoName(datos)
        );
    }
}
