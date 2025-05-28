package co.com.AutoFusdec.userinterface.comando;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearComando {
    public static Target MENU_DRAWER_COMANDO = Target.the("Campo Comando")
            .located(By.xpath("//*[@id=\"menuLateral\"]/ul/li[1]/div[2]/span"));
    public static Target NOMBRE_COMANDO = Target.the("Campo nombre")
            .located(By.id("nombreComando"));
    public static Target UBICACION_COMANDO = Target.the("Campo ubicacion")
            .located(By.id("ubicacionComando"));
    public static Target FUNDACION = Target.the("Selector fundacion")
            .located(By.id("fundacionId"));
    public static Target OPCION_FUNDACION = Target.the("Opcion de fundacion")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li"));
    public static Target BTN_ENVIAR_COMANDO = Target.the("Boton enviar comando")
            .located(By.id("enviarComandoButton"));
    public static Target PAGINACION_COMANDOS = Target.the("Texto paginacion de comando")
            .located(By.xpath("//*[@id=\"paginacionComandos\"]/div/p[2]"));

    public static Target BUSQUEDA_COMANDOS = Target.the("Filtro de Comandos")
            .located(By.id("buscarComandos"));

    public static Target BTN_ELIMINAR_COMANDO = Target.the("Boton eliminar comando")
            .located(By.id("eliminarComandoButton"));

    public static Target BTN_CONFIRMAR_ELIMINAR_COMANDO = Target.the("Boton confirmar eliminar comando")
            .located(By.id("confirmarEliminar"));


}
