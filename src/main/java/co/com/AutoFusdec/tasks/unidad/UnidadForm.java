package co.com.AutoFusdec.tasks.unidad;

import co.com.AutoFusdec.models.unidad.UnidadModel;
import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.tasks.usogeneral.SeleccionarOpcionDelMenu;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import co.com.AutoFusdec.utils.hooks.useGeneral.NamesGenerater;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.*;
import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.BTN_CONFIRMAR_UNIDAD;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UnidadForm implements Task{

    private final List<UnidadModel> datos;

    public UnidadForm(List<UnidadModel> datos) {
        this.datos = datos;
    }

    public static UnidadForm intoName(List<UnidadModel> datos){
        return   Instrumented.instanceOf(UnidadForm.class).withProperties(datos);
    }
    @Override
    public  <T extends Actor> void performAs(T actor){
        UnidadModel unidad = datos.get(0);
        String nombreUnidad = unidad.getUnidad() +" "+ NamesGenerater.nameGenerate();

        actor.attemptsTo(
                SeleccionarOpcionDelMenu.conOpcion(BTN_UNIDAD),
                Esperar.forElement(PAGE_UNIDAD),
                Click.on(BNT_AGREGAR_UNIDAD),
                Esperar.forElement(POPPUP_CREAR_UNIDAD),
                Enter.theValue(nombreUnidad).into(INPUT_NOMBRE_UNIDAD),
                Click.on(SELECT_BRIGADA),
                Esperar.forElement(SELECTS_BRIGADA),
                Click.on(OPTION_BRIGADA),
                Click.on(SELECT_USER),
                Click.on(OPTION_USER),
                Click.on(BTN_CONFIRMAR_UNIDAD),
                Esperar.forSeconds(6)

        );
        theActorInTheSpotlight().remember(SessionVariables.NombreUnidad.toString(), nombreUnidad);
    }
}
