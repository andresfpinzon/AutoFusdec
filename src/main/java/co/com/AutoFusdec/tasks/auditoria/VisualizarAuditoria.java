package co.com.AutoFusdec.tasks.auditoria;

import co.com.AutoFusdec.models.auditoria.AuditoriaModel;
import co.com.AutoFusdec.tasks.waitTask.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import java.util.List;

import static co.com.AutoFusdec.userinterface.PageAuditoria.VerAuditoria.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VisualizarAuditoria implements Task {

    private final List<AuditoriaModel> auditorias;

    public VisualizarAuditoria(List<AuditoriaModel> auditorias) {
        this.auditorias = auditorias;
    }

    public static VisualizarAuditoria interaction(List<AuditoriaModel> auditorias) {
        return new VisualizarAuditoria(auditorias);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MENU_DRAWER_AUDITORIA),
                Click.on(MENU_DRAWER_OPCION_AUDITORIA),

                WaitUntil.the(LAST_PAGE_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(By.xpath(LAST_PAGE_BUTTON)), // Desplazarse hasta el botón de la última página
                Click.on(LAST_PAGE_BUTTON),

                Click.on(BTN_INFO_AUDITORIA),

                WaitUntil.the(By.xpath(DETALLES_AUDITORIA), isVisible()).forNoMoreThan(10).seconds(),
                Esperar.forSeconds(4)
        );
    }
}