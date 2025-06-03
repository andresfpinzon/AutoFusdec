package co.com.AutoFusdec.tasks.comando;


import co.com.AutoFusdec.models.comando.FormularioComando;
import co.com.AutoFusdec.models.usogeneral.NumeroAleatorio;
import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
        String nombre = comando.getNombre_comando() + NumeroAleatorio.generarNumeroAleatorio();


        actor.attemptsTo(
                Esperar.forElement(NOMBRE_COMANDO),
                Click.on(NOMBRE_COMANDO),
                Enter.theValue(nombre).into(NOMBRE_COMANDO),
                Enter.theValue(comando.getUbicacion()).into(UBICACION_COMANDO),
                Click.on(FUNDACION),
                Click.on(OPCION_FUNDACION),
                Scroll.to(FUNDACION),
                Click.on(BTN_ENVIAR_COMANDO)
        );
        theActorInTheSpotlight().remember(SessionVariables.NombreComando.toString(),nombre);
    }
}
