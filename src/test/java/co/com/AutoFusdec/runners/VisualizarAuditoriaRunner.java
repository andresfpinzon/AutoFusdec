package co.com.AutoFusdec.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/visualizar_auditoria.feature",
        glue = {"co.com.AutoFusdec.stepsdefinitions", "co.com.AutoFusdec.utils.hooks"},
        snippets = SnippetType.CAMELCASE
)
public class VisualizarAuditoriaRunner {

}