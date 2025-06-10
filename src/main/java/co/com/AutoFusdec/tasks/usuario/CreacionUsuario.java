package co.com.AutoFusdec.tasks.usuario;

import co.com.AutoFusdec.models.usogeneral.NumeroAleatorio;
import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.models.usuario.FormularioUsuario;
import co.com.AutoFusdec.tasks.usogeneral.PaginacionInicial;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.usuario.CrearUsuario.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
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
        String documento = usuario.get(0).getNumeroDocumento() + NumeroAleatorio.generarNumeroAleatorio();
        String correo = usuario.get(0).getCorreo() + NumeroAleatorio.generarNumeroAleatorio();


        actor.attemptsTo(
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_MENU),
                Click.on(BTN_USUARIO),
                WaitUntil.the(PAGINACION_USUARIO, isVisible()).forNoMoreThan(10).seconds(),
                PaginacionInicial.conNombre("paginacion_inicial", PAGINACION_USUARIO),
                Click.on(INPUT_DOCUMENTO),
                Enter.theValue(documento).into(INPUT_DOCUMENTO),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(usuario.get(0).getNombre()).into(INPUT_NOMBRE),
                Click.on(INPUT_APELLIDO),
                Enter.theValue(usuario.get(0).getApellido()).into(INPUT_APELLIDO),
                Click.on(INPUT_CORREO),
                Enter.theValue(correo).into(INPUT_CORREO),
                Scroll.to(INPUT_CORREO),
                Click.on(INPUT_PASSWORD),
                Enter.theValue(usuario.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_ROL),
                Click.on(BTN_ELECCION),
                DoubleClick.on(BTN_ROL),
                Click.on(BTN_CREAR)

        );

        theActorInTheSpotlight().remember(SessionVariables.DocumentoUsuario.toString(), documento);
        theActorInTheSpotlight().remember(SessionVariables.NombreUsuario.toString(), usuario.get(0).getNombre());
        theActorInTheSpotlight().remember(SessionVariables.ApellidoUsuario.toString(), usuario.get(0).getApellido());
        theActorInTheSpotlight().remember(SessionVariables.CorreoUsuario.toString(), correo);

    }

}
