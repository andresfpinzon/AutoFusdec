package co.com.AutoFusdec.tasks.autenticacion;

import co.com.AutoFusdec.models.autenticacion.AutenticacionModel;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static co.com.AutoFusdec.userinterface.pageLogin.AutenticacionFusdec.*;

public class AutenticacionTask implements Task {

    private List<AutenticacionModel> credenciales;

    public AutenticacionTask (List<AutenticacionModel> credenciales){
        this.credenciales = credenciales;
    }

    public static AutenticacionTask interaction(List<AutenticacionModel> credenciales){
        return Instrumented.instanceOf(AutenticacionTask.class).withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(credenciales.get(0).getCorreo()).into(INPUT_CORREO),
                Enter.theValue(credenciales.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_INICIOSESION)

        );

    }


}
