package co.com.AutoFusdec.userinterface.PageAuditoria;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerAuditoria extends PgAuditoria {

    public static final Target MENU_DRAWER_AUDITORIA = Target.the("Menu Principal")
            .located(By.id("menuButtonLateral"));

    public static final Target MENU_DRAWER_OPCION_AUDITORIA = Target.the("Opción Auditoria en el menú")
            .located(By.xpath("//*[@id=\"menuLateral\"]/ul/li[6]"));

    public static final String LAST_PAGE_BUTTON = "/html/body/div/div/div/div[2]/div/div/div[3]/button[2]";

    public static final Target BTN_INFO_AUDITORIA = Target.the("Botón de información de auditoría")
            .located(By.xpath("//*[@id=\":r1t:\"]"));

    public static final String DETALLES_AUDITORIA = "//*[@id=\"dialog-title-20\"]/div";

}
