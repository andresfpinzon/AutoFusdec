package co.com.AutoFusdec.tasks.curso;

import co.com.AutoFusdec.models.curso.FormularioCurso;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFusdec.userinterface.curso.CrearCurso.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreacionCurso implements Task {

    private List<FormularioCurso> curso;


    public CreacionCurso(List<FormularioCurso> curso){
        this.curso = curso;
    }

    public static CreacionCurso aute(List<FormularioCurso> curso){
        return Instrumented.instanceOf(CreacionCurso.class).withProperties(curso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_MENU),
                Click.on(BTN_CURSO),
                Click.on(INPUT_NOMBRE),
                Enter.theValue(curso.get(0).getNombre()).into(INPUT_NOMBRE),
                Click.on(INPUT_DESCRIPCION),
                Enter.theValue(curso.get(0).getDescripcion()).into(INPUT_DESCRIPCION),
                Click.on(INPUT_INTENSIDAD),
                Enter.theValue(curso.get(0).getIntensidad()).into(INPUT_INTENSIDAD),
                Scroll.to(INPUT_INTENSIDAD),
                Click.on(BTN_FUNDACION),
                Click.on(BTN_ELECCION),
                Click.on(BTN_CREAR)

        );
    }

}
