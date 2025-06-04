package co.com.AutoFusdec.tasks.estudiante;

import co.com.AutoFusdec.models.estudiante.FormularioEstudiante;
import co.com.AutoFusdec.tasks.usogeneral.PaginacionInicial;
import co.com.AutoFusdec.tasks.usogeneral.SeleccionarOpcionDelMenu;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
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
        actor.attemptsTo(
                SeleccionarOpcionDelMenu.conOpcion(MENU_DRAWER_ESTUDIANTE),
                WaitUntil.the(PAGINACION_ESTUDIANTES, isVisible()).forNoMoreThan(10).seconds(),
                PaginacionInicial.conNombre("paginacion_inicial", PAGINACION_ESTUDIANTES),
                LlenarFormularioEstudiante.con(datosEstudiante)
        );
    }
}
