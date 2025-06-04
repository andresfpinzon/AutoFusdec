package co.com.AutoFusdec.tasks.comando;

import co.com.AutoFusdec.models.comando.FormularioComando;
import co.com.AutoFusdec.tasks.usogeneral.PaginacionInicial;
import co.com.AutoFusdec.tasks.usogeneral.SeleccionarOpcionDelMenu;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.comando.CrearComando.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionComando implements Task {

    private final List<FormularioComando> datosComando;

    public CreacionComando(List<FormularioComando> datosComando){
        this.datosComando = datosComando;
    }

    public static CreacionComando conLosDatos(List<FormularioComando> datosComando){
        return Instrumented.instanceOf(CreacionComando.class).withProperties(datosComando);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                SeleccionarOpcionDelMenu.conOpcion(MENU_DRAWER_COMANDO),
                WaitUntil.the(PAGINACION_COMANDOS, isVisible()).forNoMoreThan(10).seconds(),
                PaginacionInicial.conNombre("paginacion_inicial", PAGINACION_COMANDOS),
                LlenarFormularioComando.con(datosComando)
        );

    }
}
