package co.com.AutoFusdec.models.estudiante;

import co.com.AutoFusdec.models.usogeneral.Filtrable;

public class FormularioEstudiante implements Filtrable {

    private String numero_documento;
    private String nombre;
    private String apellido;
    private String tipo_de_documento;
    private String genero;
    private String unidad;
    private String colegio;
    private String edicion;
    private String grado;

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_de_documento() {
        return tipo_de_documento;
    }

    public void setTipo_de_documento(String tipo_de_documento) {
        this.tipo_de_documento = tipo_de_documento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public FormularioEstudiante(String numero_documento, String nombre, String apellido, String tipo_de_documento, String genero, String unidad, String colegio, String edicion, String grado) {
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_de_documento = tipo_de_documento;
        this.genero = genero;
        this.unidad = unidad;
        this.colegio = colegio;
        this.edicion = edicion;
        this.grado = grado;
    }

    @Override
    public String getValorFiltro() {
        return numero_documento;
    }

}
