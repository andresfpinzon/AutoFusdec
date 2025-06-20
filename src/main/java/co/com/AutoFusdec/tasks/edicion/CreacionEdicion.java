package co.com.AutoFusdec.tasks.edicion;

import co.com.AutoFusdec.models.edicion.FormularioEdicion;
import co.com.AutoFusdec.models.usogeneral.NumeroAleatorio;
import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.tasks.usogeneral.PaginacionInicial;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.edicion.CrearEdicion.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionEdicion implements Task {

    private List<FormularioEdicion> edicion;


    public CreacionEdicion(List<FormularioEdicion> edicion) { this.edicion = edicion; }

    public static CreacionEdicion aute(List<FormularioEdicion> edicion){
        return Instrumented.instanceOf(CreacionEdicion.class).withProperties(edicion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String titulo = edicion.get(0).getTitulo() + NumeroAleatorio.generarNumeroAleatorio();

        actor.attemptsTo(
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_MENU),
                Click.on(BTN_EDICION),
                WaitUntil.the(PAGINACION_EDICIONES, isVisible()).forNoMoreThan(10).seconds(),
                PaginacionInicial.conNombre("paginacion_inicial", PAGINACION_EDICIONES),
                Click.on(INPUT_TITULO),
                Enter.theValue(titulo).into(INPUT_TITULO),
                Click.on(INPUT_FECHAI),
                Enter.theValue(edicion.get(0).getFechaI()).into(INPUT_FECHAI),
                Click.on(INPUT_FECHAF),
                Enter.theValue(edicion.get(0).getFechaF()).into(INPUT_FECHAF),
                Click.on(BTN_CURSO),
                Click.on(BTN_ELECCION),
                Scroll.to(BTN_CURSO),
                Click.on(BTN_CREAR),
                Esperar.forSeconds(4)

        );

        theActorInTheSpotlight().remember(SessionVariables.TituloEdicion.toString(), titulo);
    }

}
