package co.com.AutoFusdec.tasks.brigada;

import co.com.AutoFusdec.models.brigadamodel.BrigadaModel;
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

import static co.com.AutoFusdec.userinterface.brigada.AccionesBrigadaUI.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BrigadaForm implements Task {

    private List<BrigadaModel> datos;

    public BrigadaForm(List<BrigadaModel> datos) {
        this.datos = datos;
    }

    public static BrigadaForm withData(List<BrigadaModel> datos){
        return Instrumented.instanceOf(BrigadaForm.class).withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrigadaModel brigada = datos.get(0);
        String nameBrigada = brigada.getNombreBrigada() +" "+ NamesGenerater.nameGenerate().toLowerCase();
        actor.attemptsTo(
                SeleccionarOpcionDelMenu.conOpcion(BTN_BRIGADA),
                Esperar.forElement(POPPUP_CREAR),
                Click.on(BTN_AGREGAR_BRIGADA),
                Enter.theValue(nameBrigada).into(INPUT_NOMBRE_BRIGADA),
                Enter.theValue(brigada.getUbicacionBrigada()).into(INPUT_UBICACION_BRIGADA),
                Click.on(SELECT_COMANDO),
                Click.on(OPTION_COMANDO),
                Click.on(SELECT_HORARIO_COMANDO),
                Click.on(OPTION_HORARIO),
                Click.on(BTN_CONFIRMAR_BRIGADA),
                Esperar.forElement(INPUT_BUSCAR_BRIGADA)
        );
        theActorInTheSpotlight().remember(SessionVariables.NombreBrigda.toString(), nameBrigada);
    }
}
