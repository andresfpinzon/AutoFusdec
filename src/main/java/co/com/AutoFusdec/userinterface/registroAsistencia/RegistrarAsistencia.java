package co.com.AutoFusdec.userinterface.registroAsistencia;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarAsistencia extends PageObject {
    public static Target MENU_DESPLEGABLE = Target.the("Ver menú desplegable").located(By.id("menuButtonLateral"));

    public static Target PAGE_ASISTENCIA = Target.the("Pagina Asistencia").located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[5]/div[2]/span"));

    public  static Target INPUT_ESTUDIANTE = Target.the("Ingresar el estudiante").located(By.id("estudianteInputAsistencia"));

    public static Target CHECKBOX_ASISTENCIA = Target.the("Marcar casilla de la asistencia").located(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/table/tbody/tr/td[4]/span/input"));

    public static Target BTN_GUARDAR_ASISTENCIA = Target.the("Guardar asistencia").located(By.id("btnGuardarAsistencia"));

    public static Target MENSAJE_REGISTRO_EXITOSO = Target
            .the("Asistencia registrada correctamente").located(By.xpath("/html/body/div/div/div/div[2]/div/div[2]"));


    public static Target BTN_HISTORIAL = Target.the("Boton del historial")
            .located(By.id("btnHistorialAsistence"));

    public static Target BTN_DETALLES_HISTORIAL = Target.the("Detalles del historial")
            .located(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[1]/table/tbody/tr/td[5]/button[1]"));

    public static Target INPUT_IDENTIFICACION_VALIDACION = Target.the("Validar documento")
            .located(By.id("inputIdentificacionAsistenciaValidacion"));

    public static Target NUMERO_VALIDACION = Target.the("Validar Identificacion")
            .located(By.cssSelector("table  tbody  tr  td:nth-child(1)"));
}