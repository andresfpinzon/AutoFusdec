package co.com.AutoFusdec.userinterface.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject  {

    public static Target BTN_INICIOSESION = Target.the("boton de formulario para inicio de sesion")
            .located(By.xpath("//*[@id=\"loginButton\"]"));

    public static Target BTN_CORREO = Target.the("Ingresar correo electronico del usuario")
            .located(By.xpath("//*[@id=\"correoInput\"]"));

    public static Target BTN_CONTRASEÑA = Target.the("Ingrese la contraseña ")
            .located(By.xpath("//*[@id=\"passwordInput\"]"));

   public static Target BTN_INGRESAR = Target.the("dar click en el boton para  diiriigirse a la pagina de inicio ")
           .located(By.xpath("//*[@id=\"iniciarSesionButton\"]"));
   public static Target MENU_DESPEGABLE = Target.the("Veriificar que se ingreso a la pagina de inicio")
           .located(By.id("menuLateral"));
}
