package co.com.AutoFusdec.questions.estudiante;

import co.com.AutoFusdec.models.usogeneral.SessionVariables;
import co.com.AutoFusdec.questions.usogeneral.ValidarDatosRegistro;
import co.com.AutoFusdec.tasks.usogeneral.LlenarFiltro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutoFusdec.userinterface.estudiante.CrearEstudiante.BUSQUEDA_ESTUDIANTES;

public class EstudianteCreado implements Question<Boolean> {

    public static Question<Boolean> seCreo(){
        return new EstudianteCreado();
    }
    @Override
    public Boolean answeredBy(Actor actor){
        try{
            String filtro = actor.recall(SessionVariables.NumeroDocumento.toString());
            String filtro2 = actor.recall(SessionVariables.NombreEstudiante.toString());
            String filtro3 = actor.recall(SessionVariables.ApellidoEstudiante.toString());

            actor.attemptsTo(
                    LlenarFiltro.con(BUSQUEDA_ESTUDIANTES, filtro)
            );

            boolean numeroValido = ValidarDatosRegistro.en()

        }catch {

        }
    }

}
