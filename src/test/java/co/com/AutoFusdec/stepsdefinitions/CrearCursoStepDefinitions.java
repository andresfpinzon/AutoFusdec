package co.com.AutoFusdec.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

public class CrearCursoStepDefinitions {

    @Cuando("^este en la pagina de cursos diligenciar correctamente el formulario y dar clic a crear curso:$")
    public void esteEnLaPaginaDeCursosDiligenciarCorrectamenteElFormularioYDarClicACrearCurso(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios\\.$")
    public void seDebeVerificarQueElUsuarioSeCreeCorrectamenteYSeAgregueALaListaDeUsuarios() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}