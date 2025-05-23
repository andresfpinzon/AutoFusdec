package co.com.AutoFusdec.tasks.usuario;

import co.com.AutoFusdec.models.usuario.FormularioUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.usuario.CrearUsuario.*;
import static jxl.biff.FormatRecord.logger;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionUsuario implements Task {

    private List<FormularioUsuario> usuario;


    public CreacionUsuario(List<FormularioUsuario> usuario){
        this.usuario = usuario;
    }

    public static CreacionUsuario aute(List<FormularioUsuario> usuario){
        return Instrumented.instanceOf(CreacionUsuario.class).withProperties(usuario);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        logger.info("Ejecución de clase llenar formulario");
        actor.attemptsTo(
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_MENU),
                Click.on(BTN_USUARIO),
                Click.on(INPUT_DOCUMENTO),
                Enter.theValue(usuario.get(0).getDocumento()).into(INPUT_DOCUMENTO),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(usuario.get(0).getNombre()).into(INPUT_NOMBRE),
                Click.on(INPUT_APELLIDO),
                Enter.theValue(usuario.get(0).getApellido()).into(INPUT_APELLIDO),
                Click.on(INPUT_CORREO),
                Enter.theValue(usuario.get(0).getCorreo()).into(INPUT_CORREO),
                Click.on(INPUT_PASSWORD),
                Enter.theValue(usuario.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_ROL),
                Click.on(BTN_CREAR)

        );
    }

}
