package co.com.AutoFusdec.tasks.login;

import co.com.AutoFusdec.models.autenticacion.AutenticacionModel;
import co.com.AutoFusdec.models.login.FormularioLogin;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutoFusdec.userinterface.login.Login.*;
public class LoginTask implements Task {

        private List<FormularioLogin> datos;

        public  LoginTask(List<FormularioLogin>datos){
            this.datos = datos;
        }

        public static LoginTask interaction(List<FormularioLogin> datos){
            return Instrumented.instanceOf(LoginTask.class).withProperties(datos);
        }

        @Override
        public <T extends Actor>void performAs(T actor){

            actor.attemptsTo(
                    Click.on(BTN_INICIOSESION),
                    Enter.theValue(datos.get(0).getCorreo()).into(BTN_CORREO),
                    Enter.theValue(datos.get(0).getPassword()).into(BTN_CONTRASEÑA),
                    Click.on(BTN_INGRESAR)
            );
        }

}



