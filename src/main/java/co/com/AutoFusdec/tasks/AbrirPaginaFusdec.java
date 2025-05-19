package co.com.AutoFusdec.tasks;


import co.com.AutoFusdec.userinterface.InicioFusdec;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaFusdec implements Task{

    InicioFusdec inicioFusdec;

    public static AbrirPaginaFusdec laPagina(){
        return instrumented(AbrirPaginaFusdec.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn().the(inicioFusdec));
    }

}
