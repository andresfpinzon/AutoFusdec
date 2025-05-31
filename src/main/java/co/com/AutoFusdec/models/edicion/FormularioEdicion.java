package co.com.AutoFusdec.models.edicion;

public class FormularioEdicion {

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String titulo;

    public FormularioEdicion(String titulo) {
        this.titulo = titulo;
    }
}
