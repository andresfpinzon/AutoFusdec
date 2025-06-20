package co.com.AutoFusdec.runners.SuiteAdministrativo;

import co.com.AutoFusdec.runners.*;
import co.com.AutoFusdec.runners.runnerBrigada.CrearBrigadaRunner;
import co.com.AutoFusdec.runners.runnerUnidad.CrearUnidadRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutenticacionRunner.class,
        CrearUsuarioRunner.class,
        CrearComandoRunner.class,
        CrearBrigadaRunner.class,
        CrearUnidadRunner.class,
        CrearColegioRunner.class,
        CrearCursoRunner.class,
        CrearEdicionRunner.class,
})

public class SuiteAdministrativo {


}
