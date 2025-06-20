package co.com.AutoFusdec.userinterface.colegio;

import  net.serenitybdd.core.annotations.findby.By;
import  net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class CrearColegio extends PageObject{

public static Target BTN_MENU = Target.the("DAR CLICK ENN EL MENU LATERAL ")
        .located(By.id("menuButtonLateral"));

public static Target BTN_COLEGIOS = Target.the("dar click en boton de colegios del menu despegable ")
        .located(By.xpath("//*[@id=\"menuLateral\"]/ul/li[4]"));

public static Target IN_NOMBRE_COLEGIO = Target.the("INGRESAR EL NOMBRE DEL COLEGIO ")
        .located(By.xpath("/html/body/div/div/div/form/div[1]/div/input"));

public static Target IN_EMAIL_COLEGIO = Target.the("ingresar el correo electronico del colegio a crear ")
        .located(By.xpath("//*[@id=\":rb:\"]"));

public static Target BTN_CREAR_COLEGIO = Target.the("dar click en el boton de crear colegio ")
        .located(By.xpath("/html/body/div/div/div/form/div[4]/button"));


public static Target IN_BUSCAR_COLEGIO = Target.the("buscar el colegio que acabo de agregar ")
        .located(By.xpath("//*[@id=\":rf:\"]"));

public static Target PAGINACION_COLEGIO = Target.the("verificar que ssi aparesca en la lista de colegios ")
        .located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/p[2]"));

public static Target LISTA_NOMBRE_COLEGIO = Target.the("verificar que se encuentre en la lista de colegios ")
        .located(By.xpath("/html/body/div/div/div/div[2]/table/tbody/tr/td[1]"));


public static Target LISTA_EMAIL_COLEGIO = Target.the("verificar que el correo se encuentre en la lista e colegio")
        .located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/table/thead/tr/th[2]"));

}
