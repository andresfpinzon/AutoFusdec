package co.com.AutoFusdec.userinterface.registroAsistencia;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarAsistencia extends PageObject {
    public static Target MENU_DESPLEGABLE = Target.the("Ver menú desplegable").located(By.xpath("//*[@id=\"root\"]/header/div/button/svg"));

    public static Target PAGE_ASISTENCIA = Target.the("Pagina Asistencia").located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[5]/div[2]/span"));
}
