package co.com.AutoFusdec.runners.SuiteFusdec;

import co.com.AutoFusdec.runners.AutenticacionRunner;
import co.com.AutoFusdec.runners.runnerBrigada.CrearBrigadaRunner;
import co.com.AutoFusdec.runners.runnerUnidad.CrearUnidadRunner;
import co.com.AutoFusdec.userinterface.comando.CrearComando;
import co.com.AutoFusdec.userinterface.curso.CrearCurso;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutenticacionRunner.class,
        CrearComando.class,
        CrearBrigadaRunner.class,
        CrearUnidadRunner.class,
        CrearCurso.class,
})

public class SuiteFusdec {


}
