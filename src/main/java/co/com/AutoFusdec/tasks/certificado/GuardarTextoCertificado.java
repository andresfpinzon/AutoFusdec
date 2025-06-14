package co.com.AutoFusdec.tasks.certificado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarTextoCertificado implements Task {

    private final Target elemento;
    private final String key;

    public GuardarTextoCertificado(Target elemento, String key) {
        this.elemento = elemento;
        this.key = key;
    }

    public static GuardarTextoCertificado de(String key, Target elemento) {
        return instrumented(GuardarTextoCertificado.class, elemento, key);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String textoOriginal = Text.of(elemento).viewedBy(actor).asString().trim();

        String nombreFormateado = textoOriginal.split("-")[0].trim()
                .toLowerCase()
                .replace(" ", "_");

        actor.remember(key, nombreFormateado);
    }
}
