package co.com.AutoFusdec.userinterface.PageCertificado;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCertificado {

    public static final Target MENU_DRAWER = Target.the("Menu Principal")
            .located(By.id("menuButtonLateral"));

    public static final Target MENU_DRAWER_OPCION_CERTIFICADOS = Target.the("Opción Certificados en el menú")
            .located(By.xpath("//*[@id='menuLateral']/ul/li[7]/div[2]/span"));

    public static final Target DROPDOWN_ESTUDIANTE = Target.the("Dropdown de estudiante")
            .located(By.xpath("/html/body/div/div/div/div/div/div[1]/div/div/div"));

    public static final Target OPCION_ESTUDIANTE = Target.the("Opción de estudiante")
            .located(By.xpath("//*[@id=\":r9:\"]/li[1]"));
    public static final Target DROPDOWN_HORAS = Target.the("Dropdown de horas completadas")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div"));

    public static final Target OPCION_HORAS = Target.the("Opción de horas completadas")
            .located(By.xpath("//ul[@role='listbox']//li[contains(@class, 'MuiMenuItem-root')]"));

    public static final Target DROPDOWN_FECHA = Target.the("Input de fecha de emisión")
            .located(By.xpath("//*[@id=\"fechaEmision\"]"));
    public static final Target BTN_GENERAR = Target.the("Botón Generar Certificado")
            .located(By.id("generarCertificado"));

    public static final Target ALERT_SUCCESS = Target.the("Alerta de éxito")
            .located(By.xpath("//*[@id=\"snackbar\"]/div/div[2]"));


}