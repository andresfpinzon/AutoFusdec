package co.com.AutoFusdec.utils.hooks;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PreparacionEscenario {

    @Before
    public  void sepUp(){
        setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }

    // Este metodo se ejecuta antes de cada escenario
    @Before(order = 0)
    public void setUp() {
        // Configuración inicial antes de cada escenario
        // Por ejemplo, abrir el navegador, cargar la página de inicio, etc.
        System.out.println("Configuración inicial antes de cada escenario");
    }

    // Este metodo se ejecuta después de cada escenario
    @Before(order = 1)
    public void tearDown() {
        // Limpieza después de cada escenario
        // Por ejemplo, cerrar el navegador, limpiar cookies, etc.
        System.out.println("Limpieza después de cada escenario");
    }

}
