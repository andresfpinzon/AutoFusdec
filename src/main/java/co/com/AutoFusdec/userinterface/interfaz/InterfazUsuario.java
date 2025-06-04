package co.com.AutoFusdec.userinterface.interfaz;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfazUsuario {
    public static final Target MENU_DRAWER = Target.the("Menu Principal")
            .located(By.id("menuButtonLateral"));
}

