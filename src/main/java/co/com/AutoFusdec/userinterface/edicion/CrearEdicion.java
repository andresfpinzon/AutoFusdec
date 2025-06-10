package co.com.AutoFusdec.userinterface.edicion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearEdicion extends PageObject {

    public static Target BTN_MENU = Target.the("Boton de menu desplegable")
            .located(By.id("menuButtonLateral"));
    public static Target BTN_EDICION = Target.the("Boton de usuarios")
            .located(By.xpath("//*[@id=\"menuLateral\"]/ul/li[11]/div[2]/span"));
    public static Target INPUT_TITULO = Target.the(" Ingreso del titulo")
            .located(By.id("titulo"));
    public static Target INPUT_FECHAI = Target.the("Ingreso de la fecha inicio")
            .located(By.xpath("//*[@id=\"fechaInicio\"]"));

    public static Target INPUT_FECHAF = Target.the("Ingreso de la fecha fin")
            .located(By.cssSelector("input[id='fechaFin']"));
    public static Target BTN_CURSO = Target.the("Seleccione el curso")
            .located(By.id("cursoId"));
    public static Target BTN_ELECCION = Target.the("Boton de seleccion de curso")
            .located(By.xpath("//*[@id=\":rf:\"]/li[1]"));
    public static Target BTN_CREAR = Target.the("Boton de crear")
            .located(By.xpath("//*[@id=\"root\"]/div/div/form/div[6]/button"));

    public static Target MENSAJE_EXITO = Target.the("Boton de crear")
            .located(By.xpath("//div[contains(@class,'MuiAlert-message') and text()='Usuario creado correctamente con sus roles']"));

    public static Target BUSQUEDA_EDICIONES = Target.the("Barra de busqueda")
            .located(By.id("busquedaEdicion"));

    public static Target ELEMENTO_LISTA_TITULO = Target.the("Campo titulo en lista")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"root\"]/div/div/div[2]/table/tbody/tr[1]/td[1]"));

    public static Target ELEMENTO_LISTA_FECHAI = Target.the("Campo fecha inicio en lista")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"root\"]/div/div/div[2]/table/tbody/tr[1]/td[2]"));

    public static Target ELEMENTO_LISTA_FECHAF = Target.the("Campo fecha fin en lista")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"root\"]/div/div/div[2]/table/tbody/tr[1]/td[3]"));

    public static Target PAGINACION_EDICIONES = Target.the("paginacion de ediciones")
            .located(By.id("paginacionEdicion"));
}
