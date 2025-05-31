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
            .located(By.id("fechaInicio"));
    public static Target INPUT_FECHAF = Target.the("Ingreso de la fecha fin")
            .located(By.xpath("fechaFin"));
    public static Target BTN_CURSO = Target.the("Seleccione el curso")
            .located(By.id("cursoId"));
    public static Target BTN_ELECCION = Target.the("Boton de seleccion de curso")
            .located(By.xpath("//*[@id=\":rf:\"]/li[1]"));
    public static Target BTN_CREAR = Target.the("Boton de crear")
            .located(By.xpath("//*[@id=\"root\"]/div/div/form/div[6]/button"));

    public static Target MENSAJE_EXITO = Target.the("Boton de crear")
            .located(By.xpath("//div[contains(@class,'MuiAlert-message') and text()='Usuario creado correctamente con sus roles']"));

}
