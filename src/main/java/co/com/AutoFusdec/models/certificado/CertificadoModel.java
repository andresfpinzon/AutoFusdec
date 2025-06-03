package co.com.AutoFusdec.models.certificado;

public class CertificadoModel {
    private String estudianteId;
    private String horasCompletadas;
    private String fechaEmision;

    public CertificadoModel(String estudianteId, String horasCompletadas, String fechaEmision) {
        this.estudianteId = estudianteId;
        this.horasCompletadas = horasCompletadas;
        this.fechaEmision = fechaEmision;
    }

    public String getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(String estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getHorasCompletadas() {
        return horasCompletadas;
    }

    public void setHorasCompletadas(String horasCompletadas) {
        this.horasCompletadas = horasCompletadas;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
}