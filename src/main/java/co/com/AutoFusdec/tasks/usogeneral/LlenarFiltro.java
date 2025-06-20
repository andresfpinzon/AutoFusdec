package co.com.AutoFusdec.tasks.usogeneral;


import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class LlenarFiltro implements Task {

    private final Target campoFiltro;

    private final String datoFiltro;

    public LlenarFiltro(Target campoFiltro, String datoFiltro) {
        this.campoFiltro = campoFiltro;
        this.datoFiltro = datoFiltro;
    }

    public static LlenarFiltro con(Target campoFiltro, String datoFiltro) {
        return Instrumented.instanceOf(LlenarFiltro.class)
                .withProperties(campoFiltro, datoFiltro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Esperar.forElement(campoFiltro),
                Click.on(campoFiltro),
                Enter.theValue(datoFiltro).into(campoFiltro)
        );
    }
}


