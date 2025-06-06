package co.com.AutoFusdec.models.curso;

public class FormularioCurso {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private String intensidadHoraria;

    public String getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(String intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

    public FormularioCurso(String nombre, String descripcion, String intensidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intensidadHoraria = intensidad;
    }


}
