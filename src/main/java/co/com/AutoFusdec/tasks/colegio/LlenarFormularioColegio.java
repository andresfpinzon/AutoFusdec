package co.com.AutoFusdec.tasks.colegio;

import co.com.AutoFusdec.models.colegio.FormularioColegio;
import co.com.AutoFusdec.models.usogeneral.NumeroAleatorio;
import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.colegio.CrearColegio.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LlenarFormularioColegio implements Task {

    private final List<FormularioColegio> datos;

    public LlenarFormularioColegio(List<FormularioColegio> datos) {
        this.datos = datos;
    }
    public static LlenarFormularioColegio con(List<FormularioColegio> datos ){
        return Instrumented.instanceOf(LlenarFormularioColegio.class).withProperties(datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        FormularioColegio colegio = datos.get(0);
        String nombreColegio = colegio.getNombre() + NumeroAleatorio.generarNumeroAleatorio();
        String correoColegio = colegio.getEmail() + NumeroAleatorio.generarNumeroAleatorio();
        actor.attemptsTo(

                Esperar.forElement(IN_NOMBRE_COLEGIO),
                Click.on(IN_NOMBRE_COLEGIO),
                Enter.theValue(nombreColegio).into(IN_NOMBRE_COLEGIO),
                Click.on(IN_EMAIL_COLEGIO),
                Enter.theValue(correoColegio).into(IN_EMAIL_COLEGIO),
                Click.on(BTN_CREAR_COLEGIO)
                );
                theActorInTheSpotlight().remember(SessionVariables.NombreColegio.toString(),nombreColegio);
                theActorInTheSpotlight().remember(SessionVariables.CorreoColegio.toString(),correoColegio);
    }
}

