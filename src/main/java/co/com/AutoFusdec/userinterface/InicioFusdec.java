package co.com.AutoFusdec.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://localhost:5173/home")
public class InicioFusdec extends PageObject {

    public InicioFusdec(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize(); // Maximiza la ventana al iniciar
    }
}
