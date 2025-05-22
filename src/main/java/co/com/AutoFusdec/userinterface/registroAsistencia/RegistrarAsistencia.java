package co.com.AutoFusdec.userinterface.registroAsistencia;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarAsistencia extends PageObject {
    public static Target MENU_DESPLEGABLE = Target.the("Ver menú desplegable").located(By.xpath("//*[@id=\"root\"]/header/div/button/svg"));

    public static Target PAGE_ASISTENCIA = Target.the("Pagina Asistencia").located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[5]/div[2]/span"));

    public  static Target INPUT_ESTUDIANTE = Target.the("Ingresar el estudiante").located(By.id("estudianteInputAsistencia-label"));

    public static Target CHECKBOX_ASISTENCIA = Target.the("Marcar casilla de la asistencia").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/table/tbody/tr/td[4]/span/input"));

    public static Target BTN_GUARDAR_ASISTENCIA = Target.the("Guardar asistencia").located(By.id("btnGuardarAsistencia"));

}