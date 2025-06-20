package co.com.AutoFusdec.runners.SuiteEstudiantes;


import co.com.AutoFusdec.runners.CrearCertificadoRunner;
import co.com.AutoFusdec.runners.CrearEstudianteRunner;
import co.com.AutoFusdec.runners.VisualizarAuditoriaRunner;
import co.com.AutoFusdec.runners.runnerAsistence.RegistrarAsistenciaRunner;
import co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CrearEstudianteRunner.class,
        RegistrarAsistenciaRunner.class,
        CrearCertificadoRunner.class,
        VisualizarAuditoriaRunner.class
})

public class SuiteEstudiantes {
}
