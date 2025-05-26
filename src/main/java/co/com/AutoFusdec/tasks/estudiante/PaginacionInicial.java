package co.com.AutoFusdec.tasks.estudiante;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginacionInicial implements Task {

    private final Target paginaciontarget;

    public PaginacionInicial(Target paginacionTarget) {
        this.paginaciontarget = paginacionTarget;
    }

    public static PaginacionInicial textoPaginacion(Target paginationTarget) {
        return instrumented(PaginacionInicial.class, paginationTarget);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String textoInicial = Text.of(paginaciontarget).viewedBy(actor).asString().trim();
        actor.remember("paginacion_inicial", textoInicial);
    }
}
