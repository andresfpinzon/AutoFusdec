package co.com.AutoFusdec.models.auditoria;

import java.time.LocalDateTime;

public class AuditoriaModel {
    private String id;
    private String accion;
    private LocalDateTime fecha; // Cambiado a LocalDateTime
    private String usuario;

    public AuditoriaModel() {
        this.id = id;
        this.accion = accion;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "AuditoriaModel{" +
                "id='" + id + '\'' +
                ", accion='" + accion + '\'' +
                ", fecha=" + fecha +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}