package co.com.AutoFusdec.tasks.comando;


import co.com.AutoFusdec.models.comando.FormularioComando;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.comando.CrearComando.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioComando implements Task {

    private final List<FormularioComando> datos;

    public LlenarFormularioComando(List<FormularioComando> datos) {
        this.datos = datos;
    }

    public static LlenarFormularioComando con(List<FormularioComando> datos) {
        return Instrumented.instanceOf(LlenarFormularioComando.class).withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        FormularioComando comando = datos.get(0);

        actor.attemptsTo(
                WaitUntil.the(NOMBRE_COMANDO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NOMBRE_COMANDO),
                Enter.theValue(comando.getNombre_comando()).into(NOMBRE_COMANDO),
                Click.on(UBICACION_COMANDO),
                Enter.theValue(comando.getUbicacion()).into(UBICACION_COMANDO),
                Click.on(FUNDACION),
                Click.on(OPCION_FUNDACION),
                Scroll.to(FUNDACION),
                Click.on(BTN_ENVIAR_COMANDO)
        );
    }
}
