package co.com.AutoFusdec.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

//@DefaultUrl("http://localhost:5173/home")
@DefaultUrl("https://qf5sx04q-5173.use2.devtunnels.ms/")

public class InicioFusdec extends PageObject {

    public InicioFusdec(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize(); // Maximiza la ventana al iniciar
    }
}
