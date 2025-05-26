package co.com.AutoFusdec.userinterface.PageCertificado;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageCertificado {

    public static final Target BTN_CERTIFICADOS = Target.the("Botón para acceder a certificados")
            .located(By.id("certificadosButton"));
    public static final Target DROPDOWN_ESTUDIANTE = Target.the("Dropdown de estudiante")
            .located(By.id("estudianteDropdown"));
    public static final Target DROPDOWN_HORAS = Target.the("Dropdown de horas completadas")
            .located(By.id("horasDropdown"));
    public static final Target INPUT_FECHA = Target.the("Input de fecha de emisión")
            .located(By.id("fechaInput"));
    public static final Target BTN_GENERAR = Target.the("Botón Generar Certificado")
            .located(By.id("generarCertificadoButton"));
    public static final Target ALERT_SUCCESS = Target.the("Alerta de éxito")
            .located(By.xpath("//div[contains(@class, 'MuiAlert-success')]"));
}