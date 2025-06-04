package co.com.AutoFusdec.tasks.usogeneral;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginacionInicial implements Task {

    private final Target paginacionTarget;
    private final String key;

    public PaginacionInicial(Target paginacionTarget, String key) {
        this.paginacionTarget = paginacionTarget;
        this.key = key;
    }

    public static PaginacionInicial conNombre(String key, Target paginacionTarget) {
        return instrumented(PaginacionInicial.class, paginacionTarget, key);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String texto = Text.of(paginacionTarget).viewedBy(actor).asString().trim();
        actor.remember(key, texto);
    }
}

