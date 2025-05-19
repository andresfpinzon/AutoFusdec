package co.com.AutoFusdec.tasks;

import co.com.AutoFusdec.userinterface.InicioFacebook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    InicioFacebook inicioFacebook;

    public static AbrirPagina lapagina(){ return Tasks.instrumented(AbrirPagina.class);}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(inicioFacebook));
    }
}
