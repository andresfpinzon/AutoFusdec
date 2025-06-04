package co.com.AutoFusdec.tasks.edicion;

import co.com.AutoFusdec.models.edicion.FormularioEdicion;
import co.com.AutoFusdec.models.usuario.FormularioUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.edicion.CrearEdicion.*;
import static co.com.AutoFusdec.userinterface.edicion.CrearEdicion.BTN_CREAR;
import static co.com.AutoFusdec.userinterface.edicion.CrearEdicion.BTN_ELECCION;
import static co.com.AutoFusdec.userinterface.edicion.CrearEdicion.BTN_MENU;
import static co.com.AutoFusdec.userinterface.usuario.CrearUsuario.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionEdicion implements Task {

    private List<FormularioEdicion> edicion;


    public CreacionEdicion(List<FormularioEdicion> edicion) { this.edicion = edicion; }

    public static CreacionEdicion aute(List<FormularioEdicion> edicion){
        return Instrumented.instanceOf(CreacionEdicion.class).withProperties(edicion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_MENU),
                Click.on(BTN_EDICION),
                Click.on(INPUT_TITULO),
                Enter.theValue(edicion.get(0).getTitulo()).into(INPUT_TITULO),
                Click.on(INPUT_FECHAI),
                Enter.theValue(edicion.get(0).getFechaI()).into(INPUT_FECHAI),
                Click.on(INPUT_FECHAF),
                Enter.theValue(edicion.get(0).getFechaF()).into(INPUT_FECHAF),
                Click.on(BTN_CURSO),
                Click.on(BTN_ELECCION),
                Scroll.to(BTN_CURSO),
                Click.on(BTN_CREAR)

        );
    }

}
