package co.com.AutoFusdec.userinterface.usuario;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearUsuario extends PageObject {

    public static Target BTN_MENU = Target.the("Boton de menu desplegable")
            .located(By.id("menuButtonLateral"));
    public static Target BTN_USUARIO = Target.the("Boton de usuarios")
            .located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[8]/div[2]/span"));
    public static Target INPUT_DOCUMENTO = Target.the(" Ingreso del numero de documento")
            .located(By.id("numeroDocumento"));
    public static Target INPUT_NOMBRE = Target.the("Ingreso del nombre")
            .located(By.id("nombre"));
    public static Target INPUT_APELLIDO = Target.the("Ingreso del apellido ")
            .located(By.id("apellido"));
    public static Target INPUT_CORREO = Target.the("Ingrese el correo")
            .located(By.id("correo"));
    public static Target INPUT_PASSWORD = Target.the("Ingreso de la contraseña")
            .located(By.id("password"));
    public static Target BTN_ROL = Target.the("Boton de enviar")
            .located(By.xpath("//*[@id=\"root\"]/div/div/form/div[6]/div/div"));

    public static Target BTN_ELECCION = Target.the("Boton de enviar")
            .located(By.xpath("//*[@id=\":rj:\"]/li[1]/span[1]/input"));
    public static Target BTN_CREAR = Target.the("Boton de crear")
            .located(By.xpath("//*[@id=\"root\"]/div/div/form/div[7]/button"));
    public static Target MENSAJE_EXITO = Target.the("Boton de crear")
            .located(By.xpath("//div[contains(@class,'MuiAlert-message') and text()='Usuario creado correctamente con sus roles']"));

}
