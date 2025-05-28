package co.com.AutoFusdec.userinterface.comando;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearComando {
    public static Target MENU_DRAWER_COMANDO = Target.the("Campo Comando")
            .located(By.xpath("//*[@id=\"menuLateral\"]/ul/li[1]/div[2]/span"));
    public static Target NOMBRE_COMANDO = Target.the("Campo nombre")
            .located(By.id("nombreComando"));
    public static Target UBICACION_COMANDO = Target.the("Campo apellido")
            .located(By.id("ubicacionComando"));
    public static Target FUNDACION = Target.the("Selector tipo de documento")
            .located(By.id("fundacionId"));
    public static Target OPCION_FUNDACION = Target.the("Selector tipo de documento")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li"));
    public static Target BTN_ENVIAR_COMANDO = Target.the("Opcion tipo de documento")
            .located(By.id("enviarComandoButton"));
    public static Target PAGINACION_COMANDOS = Target.the("Texto paginacion de estudiante")
            .located(By.xpath("//*[@id=\"paginacionComandos\"]/div/p[2]"));
    public static Target BUSQUEDA_COMANDOS = Target.the("Texto paginacion de estudiante")
            .located(By.id("buscarComandos"));



}
