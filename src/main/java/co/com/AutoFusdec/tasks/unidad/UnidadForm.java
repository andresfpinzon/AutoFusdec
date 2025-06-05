package co.com.AutoFusdec.tasks.unidad;

import co.com.AutoFusdec.tasks.usogeneral.SeleccionarOpcionDelMenu;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.*;
import static co.com.AutoFusdec.userinterface.unidad.UnidadAccionUI.BTN_CONFIRMAR_UNIDAD;

public class UnidadForm implements Task{

    private final String nombre;

    public UnidadForm(String nombre) {
        this.nombre = nombre;
    }


    public static UnidadForm intoName(String nombre){
        return  new UnidadForm(nombre);
    }
    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                SeleccionarOpcionDelMenu.conOpcion(BTN_UNIDAD),
                Esperar.forElement(PAGE_UNIDAD),
                Click.on(BNT_AGREGAR_UNIDAD),
                Esperar.forElement(POPPUP_CREAR_UNIDAD),
                Enter.theValue(nombre).into(INPUT_NOMBRE_UNIDAD),
                Click.on(SELECT_BRIGADA),
                Esperar.forElement(SELECTS_BRIGADA),
                Click.on(OPTION_BRIGADA),
                Click.on(SELECT_USER),
                Click.on(OPTION_USER),
                Click.on(BTN_CONFIRMAR_UNIDAD),
                Enter.theValue(nombre).into(INPUT_SEARCH_UNIDAD)
        );
    }
}
