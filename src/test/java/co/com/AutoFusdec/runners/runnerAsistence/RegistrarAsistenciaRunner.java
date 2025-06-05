package co.com.AutoFusdec.runners.runnerAsistence;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/asistenceFeature/registrar_asistencia.feature",
        glue = {"co.com.AutoFusdec.stepsdefinitions", "co.com.AutoFusdec.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class RegistrarAsistenciaRunner {
}
