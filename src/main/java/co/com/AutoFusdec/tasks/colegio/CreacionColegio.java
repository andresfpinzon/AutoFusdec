package co.com.AutoFusdec.tasks.colegio;

import co.com.AutoFusdec.models.colegio.FormularioColegio;
import co.com.AutoFusdec.tasks.usogeneral.PaginacionInicial;
import co.com.AutoFusdec.tasks.usogeneral.SeleccionarOpcionDelMenu;
import co.com.AutoFusdec.userinterface.colegio.CrearColegio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.security.PrivilegedAction;
import java.util.List;

import static co.com.AutoFusdec.userinterface.colegio.CrearColegio.*;
import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.PAGINACION_ESTUDIANTES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CreacionColegio implements Task{

    private List<FormularioColegio> datosColegio;

    public CreacionColegio(List<FormularioColegio> datosColegio) {this.datosColegio = datosColegio; }

    public static CreacionColegio conLosDatos(List<FormularioColegio> datosColegio){
        return  Instrumented.instanceOf(CreacionColegio.class).withProperties(datosColegio);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                SeleccionarOpcionDelMenu.conOpcion(BTN_COLEGIOS),
                 WaitUntil.the(PAGINACION_COLEGIO, isVisible()).forNoMoreThan(10).seconds(),
                 PaginacionInicial.conNombre("paginacion_inicial", PAGINACION_COLEGIO),
                 LlenarFormularioColegio.con(datosColegio)

        );
    }
}
