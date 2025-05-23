package co.com.AutoFusdec.userinterface.estudiante;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearEstudiante extends PageObject {

    public static Target MENU_DRAWER = Target.the("Menu Principal")
            .located(By.xpath("//*[@id=\"root\"]/header/div/button"));
    public static Target MENU_DRAWER_OPCION = Target.the("Campo Estudiante")
            .located(By.xpath("/html/body/div[2]/div[3]/div/ul/li[9]"));
    public static Target NUMERO_DOCUMENTO = Target.the("Campo numero de documento")
            .located(By.id("numeroDocumento"));
    public static Target NOMBRE = Target.the("Campo nombre")
            .located(By.id("nombre"));
    public static Target APELLIDO = Target.the("Campo apellido")
            .located(By.id("apellido"));
    public static Target TIPO_DOCUMENTO = Target.the("Selector tipo de documento")
            .located(By.id("tipoDocumento"));
    public static Target OPCION_TIPO_DOCUMENTO = Target.the("Opcion tipo de documento")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]"));
    public static Target GENERO = Target.the("Selector genero")
            .located(By.id("genero"));
    public static Target OPCION_GENERO = Target.the("Opcion selector genero")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]"));
    public static Target UNIDAD = Target.the("Selector unidad")
            .located(By.id("unidadId"));
    public static Target OPCION_UNIDAD = Target.the("Opcion selector unidad")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]"));
    public static Target COLEGIO = Target.the("Selector colegio")
            .located(By.id("colegioId"));
    public static Target OPCION_COLEGIO = Target.the("OcSelector colegio")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]"));
    public static Target EDICION = Target.the("Selector edicion")
            .located(By.id("edicionId"));
    public static Target OPCION_EDICION = Target.the("Selector edicion")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]"));
    public static Target GRADO = Target.the("Selector grado")
            .located(By.id("grado"));
    public static Target OPCION_GRADO = Target.the("Selector grado")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]"));
    public static Target BOTON_CREAR = Target.the("Boton crear estudiante")
            .located(By.id("crearEstudianteButton"));

    public static Target PG_ESTUDIANTES = Target.the("Texto paginacion de estudiante")
            .located(By.xpath("//*[@id=\"paginacionEstudiantes\"]/div/p[2]"));


}
