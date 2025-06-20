package co.com.AutoFusdec.runners.SuiteAdministrativo;

import co.com.AutoFusdec.runners.AutenticacionRunner;
import co.com.AutoFusdec.runners.runnerBrigada.CrearBrigadaRunner;
import co.com.AutoFusdec.runners.runnerUnidad.CrearUnidadRunner;
import co.com.AutoFusdec.userinterface.colegio.CrearColegio;
import co.com.AutoFusdec.userinterface.comando.CrearComando;
import co.com.AutoFusdec.userinterface.curso.CrearCurso;
import co.com.AutoFusdec.userinterface.edicion.CrearEdicion;
import co.com.AutoFusdec.userinterface.usuario.CrearUsuario;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutenticacionRunner.class,
        CrearUsuario.class,
        CrearComando.class,
        CrearBrigadaRunner.class,
        CrearUnidadRunner.class,
        CrearColegio.class,
        CrearCurso.class,
        CrearEdicion.class,
})

public class SuiteAdministrativo {


}
