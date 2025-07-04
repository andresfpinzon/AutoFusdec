package co.com.AutoFusdec.userinterface.curso;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearCurso extends PageObject {

    public static Target BTN_MENU = Target.the("Boton de menu desplegable")
            .located(By.id("menuButtonLateral"));
    public static Target BTN_CURSO = Target.the("Boton de cursos ")
            .located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[10]/div[2]/span"));
    public static Target INPUT_NOMBRE = Target.the(" Ingreso del nombre del curso")
            .located(By.id("nombre"));
    public static Target INPUT_DESCRIPCION = Target.the("Ingreso de la descripcion")
            .located(By.id("descripcion"));
    public static Target INPUT_INTENSIDAD = Target.the("Ingreso de la intencidad horaria")
            .located(By.id("intensidadHoraria"));
    public static Target BTN_FUNDACION = Target.the("Boton de fundacion")
            .located(By.xpath("//*[@id=\"mui-component-select-fundacionId\"]"));
    public static Target BTN_ELECCION = Target.the("Boton de seleccion")
            .located(By.xpath("//*[@id=\":rf:\"]/li"));
    public static Target BTN_CREAR = Target.the("Boton de crear")
            .located(By.xpath("//*[@id=\"root\"]/div/div/form/div[6]/button"));
    public static Target MENSAJE_EXITO = Target.the("mensaje de exito")
            .located(By.xpath("/html/body/div/div/div/div[3]/div/div[2]"));

    public static Target BUSQUEDA_CURSOS = Target.the("Barra de busqueda")
            .located(By.id("busquedaCurso"));

    public static Target ELEMENTO_LISTA_NOMBRE = Target.the("Campo nombre en lista")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"root\"]/div/div/div[2]/table/tbody/tr[1]/td[1]"));

    public static Target PAGINACION_CURSOS = Target.the("paginacion de cursos")
            .located(By.id("paginacionCurso"));


}
