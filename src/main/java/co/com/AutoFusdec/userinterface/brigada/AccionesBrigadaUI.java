package co.com.AutoFusdec.userinterface.brigada;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class AccionesBrigadaUI extends PageObject {
    public static Target MENU_LATERAL = Target.the("Menu lateral")
            .located(By.id("menuButtonLateral"));
    public static Target BTN_BRIGADA = Target.the("Seleecion de la pagina brigada")
            .located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[2]/div[2]/span"));
    public static Target BTN_AGREGAR_BRIGADA = Target.the("Botón para agregar una brigada")
            .located(By.id("btnAgregarBrigada"));
    public static Target INPUT_NOMBRE_BRIGADA = Target.the("Ingresar nombre de la brigada")
            .located(By.id("inputNombreBrigada"));
    public static Target INPUT_UBICACION_BRIGADA = Target.the("Ingresar ubicación")
            .located(By.id("inputUbicacionBrigada"));
    public static Target SELECT_COMANDO = Target.the("Selccionar el menú de comando")
            .located(By.id("selectComando"));
    public static Target OPTION_COMANDO = Target.the("Opción de comando")
            .located(By.xpath("//*[@id=\"selectComando\"]/option[4]"));
    public static Target SELECT_HORARIO_COMANDO = Target.the("Seleccionar horario para el comando")
            .located(By.id("selectComando"));
    public static Target OPTION_HORARIO = Target.the("Opción de horario para el comando")
            .located(By.id("optTarde"));
    public static Target BTN_CONFIRMAR_BRIGADA = Target.the("Confirmar la creación de brigada")
            .located(By.id("btnConfirmarBrigada"));
    public static Target MENSAJE_EXITOSO = Target
            .the("Mensaje de exito, de crear brigada").located(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]"));
    public static Target PAGE_BRIGADA = Target.the("Pagina brigada")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]"));
    public static Target POPPUP_CREAR = Target.the("Modal de crear brigada")
            .located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div"));

}
