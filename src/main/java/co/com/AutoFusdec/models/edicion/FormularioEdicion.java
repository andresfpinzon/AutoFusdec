package co.com.AutoFusdec.models.edicion;

public class FormularioEdicion {

    public FormularioEdicion(String titulo, String fechaI, String fechaF) {
        this.titulo = titulo;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
    }
    private String titulo;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String fechaI;

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    private String fechaF;
    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

}
