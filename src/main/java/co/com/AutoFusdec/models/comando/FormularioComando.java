package co.com.AutoFusdec.models.comando;

public class FormularioComando{

    private String nombre_comando;
    private String ubicacion;
    private String fundacion;

    public String getNombre_comando() {
        return nombre_comando;
    }

    public void setNombre_comando(String nombre_comando) {
        this.nombre_comando = nombre_comando;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public FormularioComando(String nombre_comando, String ubicacion, String fundacion) {
        this.nombre_comando = nombre_comando;
        this.ubicacion = ubicacion;
        this.fundacion = fundacion;
    }

}
