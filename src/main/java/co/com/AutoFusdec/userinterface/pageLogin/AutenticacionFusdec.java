package co.com.AutoFusdec.userinterface.pageLogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutenticacionFusdec extends PageObject {
    public static Target BTN_LOGIN = Target.the("Botón login").located(By.id("loginButton"));
    public static Target INPUT_CORREO = Target.the("Ingresar correo").located(By.id("correoInput"));
    //*[@id=":r9:"]
    public static Target INPUT_PASSWORD = Target.the("Ingreso password").located(By.id("passwordInput"));
    public static Target BTN_INICIOSESION = Target.the("Boton ingreso").located(By.id("iniciarSesionButton"));
    public static Target MENU_PRINCIPAL = Target.the("Menu Principal")
            .located(By.id("menuButtonLateral"));

}
