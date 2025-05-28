package co.com.AutoFusdec.userinterface.unidad;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UnidadAccionUI extends PageObject {
    public static Target MENU_LATERAL_UNIDAD = Target.the("Menu lateral")
            .located(By.id("menuButtonLateral"));
    public static Target BTN_UNIDAD = Target.the("Boton Unidad")
            .located(By.xpath("//*[@id=\"menuLateral\"]/ul/li[3]/div[2]/span"));
    public static Target PAGE_UNIDAD = Target.the("Pagina de unidad")
            .located(By.xpath("//*[@id=\"root\"]/div/div"));
    public static Target BNT_AGREGAR_UNIDAD = Target.the("Boton para agregar una unidad")
            .located(By.id("btnAgregarUnidad"));
    public static Target POPPUP_CREAR_UNIDAD = Target.the("Poppup de crear unidad")
            .located(By.id("//*[@id=\"root\"]/div/div/div[2]/div"));
    public static Target INPUT_NOMBRE_UNIDAD = Target.the("Ingresar nombre unidad")
            .located(By.id("inpurtNombre"));
    public static Target SELECT_BRIGADA = Target.the("Select para una brigada")
            .located(By.id("brigada-select"));
    public static Target OPTION_BRIGADA = Target.the("Opcion de brigada seleccionada")
            .located(By.xpath("//*[@id=\":r31:\"]/li[3]/div/h6"));
    public static Target SELECT_USER = Target.the("Select para el user")
            .located(By.xpath("//*[@id=\"usuario-select\"]"));
    public static Target OPTION_USER = Target.the("Opcion de user seleccionado")
            .located(By.xpath("//*[@id=\":r33:\"]/li[2]/div"));
    public static Target BTN_CONFIRMAR_UNIDAD = Target.the("Confirmar el crear una unidad")
            .located(By.id("btnConfirmar"));
    public static Target MESSAGE_SUCCESFULLY_UNIDAD = Target.the("Unidad creada correctamente")
            .located(By.xpath("/div/div/div[2]"));
}
