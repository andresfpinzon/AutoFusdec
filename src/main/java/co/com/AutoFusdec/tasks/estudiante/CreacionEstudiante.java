package co.com.AutoFusdec.tasks.estudiante;

import co.com.AutoFusdec.models.estudiante.FormularioEstudiante;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionEstudiante implements Task {

    private List<FormularioEstudiante> datosEstudiante;

    public CreacionEstudiante(List<FormularioEstudiante> datosEstudiante) {
        this.datosEstudiante = datosEstudiante;
    }

    public static CreacionEstudiante conLosDatos(List<FormularioEstudiante> datosEstudiante) {
        return Instrumented.instanceOf(CreacionEstudiante.class).withProperties(datosEstudiante);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        FormularioEstudiante estudiante = datosEstudiante.get(0);
        actor.attemptsTo(
                Click.on(MENU_DRAWER),
                Click.on(MENU_DRAWER_OPCION),
                WaitUntil.the(PG_ESTUDIANTES, isVisible()).forNoMoreThan(10).seconds(),
                PaginacionInicial.textFrom(PG_ESTUDIANTES),
                WaitUntil.the(NUMERO_DOCUMENTO, isVisible()).forNoMoreThan(10).seconds(),
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
                Click.on(BOTON_CREAR)
        );
    }
}
