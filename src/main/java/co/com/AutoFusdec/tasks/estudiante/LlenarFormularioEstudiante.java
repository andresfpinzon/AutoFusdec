package co.com.AutoFusdec.tasks.estudiante;

import co.com.AutoFusdec.models.estudiante.FormularioEstudiante;
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

import java.util.List;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormularioEstudiante implements Task {

    private final List<FormularioEstudiante> datos;

    public LlenarFormularioEstudiante(List<FormularioEstudiante> datos) {
        this.datos = datos;
    }

    public static LlenarFormularioEstudiante con(List<FormularioEstudiante> datos) {
        return Instrumented.instanceOf(LlenarFormularioEstudiante.class).withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        FormularioEstudiante estudiante = datos.get(0);
        String numeroDocumento = estudiante.getNumero_documento() + NumeroAleatorio.generarNumeroAleatorio();

        actor.remember(SessionVariables.NumeroDocumento.toString(), numeroDocumento);
        actor.remember(SessionVariables.NombreEstudiante.toString(), estudiante.getNombre());
        actor.remember(SessionVariables.ApellidoEstudiante.toString(), estudiante.getApellido());

        actor.attemptsTo(

                Esperar.forElement(NUMERO_DOCUMENTO),
                Click.on(NUMERO_DOCUMENTO),
                Enter.theValue(estudiante.getNumero_documento()).into(NUMERO_DOCUMENTO),
                Click.on(NOMBRE),
                Enter.theValue(estudiante.getNombre()).into(NOMBRE),
                Click.on(APELLIDO),
                Enter.theValue(estudiante.getApellido()).into(APELLIDO),
                Click.on(TIPO_DOCUMENTO),
                Click.on(OPCION_TIPO_DOCUMENTO),
                Click.on(GENERO),
                Click.on(OPCION_GENERO),
                Scroll.to(GENERO),
                Click.on(UNIDAD),
                Click.on(OPCION_UNIDAD),
                Click.on(COLEGIO),
                Click.on(OPCION_COLEGIO),
                Click.on(EDICION),
                Click.on(OPCION_EDICION),
                Click.on(GRADO),
                Click.on(OPCION_GRADO),
                Scroll.to(GRADO),
                Click.on(BTN_ENVIAR_ESTUDIANTE)
        );
    }
}

