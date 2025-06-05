package co.com.AutoFusdec.tasks.usogeneral;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class LimpiarFiltro implements Task {

    private final Target campoFiltro;

    public LimpiarFiltro(Target campoFiltro) {
        this.campoFiltro = campoFiltro;
    }
    public static LimpiarFiltro con(Target campoFiltro) {
        return Instrumented.instanceOf(LimpiarFiltro.class)
                .withProperties(campoFiltro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String datoFiltro = actor.recall("datoFiltro");
        actor.attemptsTo(
                Click.on(campoFiltro),
                Enter.theValue("").into(campoFiltro)
        );
    }


}
