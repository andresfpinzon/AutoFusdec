package co.com.AutoFusdec.tasks.brigada;

import co.com.AutoFusdec.models.brigadamodel.BrigadaModel;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.*;

public class CrearBrigadaTask implements Task {
    private List<BrigadaModel> datos;

    public CrearBrigadaTask(List<BrigadaModel> datos) {
        this.datos = datos;
    }

    public static CrearBrigadaTask ingresarDatosBrigada(List<BrigadaModel> datos){
        return Instrumented.instanceOf(CrearBrigadaTask.class).withProperties(datos);
    }

    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                BrigadaForm.withData(datos)
        );
    }
}
